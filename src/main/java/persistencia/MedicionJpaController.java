/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import logica.Medicion;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Ian
 */
public class MedicionJpaController implements Serializable {

    public MedicionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public MedicionJpaController(){
        emf = Persistence.createEntityManagerFactory("vtvPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Medicion medicion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(medicion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Medicion medicion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            medicion = em.merge(medicion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = medicion.getId();
                if (findMedicion(id) == null) {
                    throw new NonexistentEntityException("The medicion with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Medicion medicion;
            try {
                medicion = em.getReference(Medicion.class, id);
                medicion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The medicion with id " + id + " no longer exists.", enfe);
            }
            em.remove(medicion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Medicion> findMedicionEntities() {
        return findMedicionEntities(true, -1, -1);
    }

    public List<Medicion> findMedicionEntities(int maxResults, int firstResult) {
        return findMedicionEntities(false, maxResults, firstResult);
    }

    private List<Medicion> findMedicionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Medicion.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Medicion findMedicion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Medicion.class, id);
        } finally {
            em.close();
        }
    }

    public int getMedicionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Medicion> rt = cq.from(Medicion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
