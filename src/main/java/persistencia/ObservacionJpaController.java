    package persistencia;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import logica.Observacion;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Ian
 */
public class ObservacionJpaController implements Serializable {

    public ObservacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Observacion observacion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(observacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Observacion observacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            observacion = em.merge(observacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = observacion.getId();
                if (findObservacion(id) == null) {
                    throw new NonexistentEntityException("The observacion with id " + id + " no longer exists.");
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
            Observacion observacion;
            try {
                observacion = em.getReference(Observacion.class, id);
                observacion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The observacion with id " + id + " no longer exists.", enfe);
            }
            em.remove(observacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Observacion> findObservacionEntities() {
        return findObservacionEntities(true, -1, -1);
    }

    public List<Observacion> findObservacionEntities(int maxResults, int firstResult) {
        return findObservacionEntities(false, maxResults, firstResult);
    }

    private List<Observacion> findObservacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Observacion.class));
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

    public Observacion findObservacion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Observacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getObservacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Observacion> rt = cq.from(Observacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
