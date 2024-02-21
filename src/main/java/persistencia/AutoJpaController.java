/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;
import logica.Auto;
import logica.Propietario;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Ian
 */
public class AutoJpaController implements Serializable {

    public AutoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public AutoJpaController(){
        emf = Persistence.createEntityManagerFactory("vtvPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Auto auto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Propietario propietario = auto.getPropietario();
            if (propietario != null) {
                propietario = em.getReference(propietario.getClass(), propietario.getId());
                auto.setPropietario(propietario);
            }
            em.persist(auto);
            if (propietario != null) {
                propietario.getCars().add(auto);
                propietario = em.merge(propietario);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Auto auto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Auto persistentAuto = em.find(Auto.class, auto.getId());
            Propietario propietarioOld = persistentAuto.getPropietario();
            Propietario propietarioNew = auto.getPropietario();
            if (propietarioNew != null) {
                propietarioNew = em.getReference(propietarioNew.getClass(), propietarioNew.getId());
                auto.setPropietario(propietarioNew);
            }
            auto = em.merge(auto);
            if (propietarioOld != null && !propietarioOld.equals(propietarioNew)) {
                propietarioOld.getCars().remove(auto);
                propietarioOld = em.merge(propietarioOld);
            }
            if (propietarioNew != null && !propietarioNew.equals(propietarioOld)) {
                propietarioNew.getCars().add(auto);
                propietarioNew = em.merge(propietarioNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = auto.getId();
                if (findAuto(id) == null) {
                    throw new NonexistentEntityException("The auto with id " + id + " no longer exists.");
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
            Auto auto;
            try {
                auto = em.getReference(Auto.class, id);
                auto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The auto with id " + id + " no longer exists.", enfe);
            }
            Propietario propietario = auto.getPropietario();
            if (propietario != null) {
                propietario.getCars().remove(auto);
                propietario = em.merge(propietario);
            }
            em.remove(auto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Auto> findAutoEntities() {
        return findAutoEntities(true, -1, -1);
    }

    public List<Auto> findAutoEntities(int maxResults, int firstResult) {
        return findAutoEntities(false, maxResults, firstResult);
    }

    private List<Auto> findAutoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Auto.class));
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

    public Auto findAuto(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Auto.class, id);
        } finally {
            em.close();
        }
    }

    public int getAutoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Auto> rt = cq.from(Auto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
