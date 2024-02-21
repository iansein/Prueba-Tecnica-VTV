/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.lang.ModuleLayer.Controller;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import logica.Inspeccion;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Ian
 */
public class InspeccionJpaController implements Serializable {

    public InspeccionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public InspeccionJpaController(){
        emf = Persistence.createEntityManagerFactory("vtvPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Inspeccion inspeccion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(inspeccion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Inspeccion inspeccion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            inspeccion = em.merge(inspeccion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = inspeccion.getId();
                if (findInspeccion(id) == null) {
                    throw new NonexistentEntityException("The inspeccion with id " + id + " no longer exists.");
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
            Inspeccion inspeccion;
            try {
                inspeccion = em.getReference(Inspeccion.class, id);
                inspeccion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The inspeccion with id " + id + " no longer exists.", enfe);
            }
            em.remove(inspeccion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Inspeccion> findInspeccionEntities() {
        return findInspeccionEntities(true, -1, -1);
    }

    public List<Inspeccion> findInspeccionEntities(int maxResults, int firstResult) {
        return findInspeccionEntities(false, maxResults, firstResult);
    }

    private List<Inspeccion> findInspeccionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Inspeccion.class));
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

    public Inspeccion findInspeccion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Inspeccion.class, id);
        } finally {
            em.close();
        }
    }

    public int getInspeccionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Inspeccion> rt = cq.from(Inspeccion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
