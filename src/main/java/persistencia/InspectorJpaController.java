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
import logica.Inspector;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Ian
 */
public class InspectorJpaController implements Serializable {

    public InspectorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public InspectorJpaController(){
        emf = Persistence.createEntityManagerFactory("vtvPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Inspector inspector) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(inspector);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Inspector inspector) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            inspector = em.merge(inspector);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = inspector.getId();
                if (findInspector(id) == null) {
                    throw new NonexistentEntityException("The inspector with id " + id + " no longer exists.");
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
            Inspector inspector;
            try {
                inspector = em.getReference(Inspector.class, id);
                inspector.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The inspector with id " + id + " no longer exists.", enfe);
            }
            em.remove(inspector);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Inspector> findInspectorEntities() {
        return findInspectorEntities(true, -1, -1);
    }

    public List<Inspector> findInspectorEntities(int maxResults, int firstResult) {
        return findInspectorEntities(false, maxResults, firstResult);
    }

    private List<Inspector> findInspectorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Inspector.class));
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

    public Inspector findInspector(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Inspector.class, id);
        } finally {
            em.close();
        }
    }

    public int getInspectorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Inspector> rt = cq.from(Inspector.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
