/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import logica.Oblea;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Ian
 */
public class ObleaJpaController implements Serializable {

    public ObleaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ObleaJpaController(){
        emf = Persistence.createEntityManagerFactory("vtvPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Oblea oblea) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(oblea);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Oblea oblea) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            oblea = em.merge(oblea);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = oblea.getId();
                if (findOblea(id) == null) {
                    throw new NonexistentEntityException("The oblea with id " + id + " no longer exists.");
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
            Oblea oblea;
            try {
                oblea = em.getReference(Oblea.class, id);
                oblea.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The oblea with id " + id + " no longer exists.", enfe);
            }
            em.remove(oblea);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Oblea> findObleaEntities() {
        return findObleaEntities(true, -1, -1);
    }

    public List<Oblea> findObleaEntities(int maxResults, int firstResult) {
        return findObleaEntities(false, maxResults, firstResult);
    }

    private List<Oblea> findObleaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Oblea.class));
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

    public Oblea findOblea(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Oblea.class, id);
        } finally {
            em.close();
        }
    }

    public int getObleaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Oblea> rt = cq.from(Oblea.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
