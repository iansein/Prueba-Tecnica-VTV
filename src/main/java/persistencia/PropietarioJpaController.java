/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import logica.Auto;
import java.util.ArrayList;
import java.util.List;
import logica.Propietario;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Ian
 */
public class PropietarioJpaController implements Serializable {

    public PropietarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public PropietarioJpaController(){
        emf = Persistence.createEntityManagerFactory("vtvPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Propietario propietario) {
        if (propietario.getAutos() == null) {
            propietario.setAutos(new ArrayList<Auto>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ArrayList<Auto> attachedAutos = new ArrayList<Auto>();
            for (Auto autosAutoToAttach : propietario.getAutos()) {
                autosAutoToAttach = em.getReference(autosAutoToAttach.getClass(), autosAutoToAttach.getId());
                attachedAutos.add(autosAutoToAttach);
            }
            propietario.setAutos(attachedAutos);
            em.persist(propietario);
            for (Auto autosAuto : propietario.getAutos()) {
                Propietario oldPropietarioOfAutosAuto = autosAuto.getPropietario();
                autosAuto.setPropietario(propietario);
                autosAuto = em.merge(autosAuto);
                if (oldPropietarioOfAutosAuto != null) {
                    oldPropietarioOfAutosAuto.getAutos().remove(autosAuto);
                    oldPropietarioOfAutosAuto = em.merge(oldPropietarioOfAutosAuto);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Propietario propietario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Propietario persistentPropietario = em.find(Propietario.class, propietario.getId());
            ArrayList<Auto> autosOld = persistentPropietario.getAutos();
            ArrayList<Auto> autosNew = propietario.getAutos();
            ArrayList<Auto> attachedAutosNew = new ArrayList<Auto>();
            for (Auto autosNewAutoToAttach : autosNew) {
                autosNewAutoToAttach = em.getReference(autosNewAutoToAttach.getClass(), autosNewAutoToAttach.getId());
                attachedAutosNew.add(autosNewAutoToAttach);
            }
            autosNew = attachedAutosNew;
            propietario.setAutos(autosNew);
            propietario = em.merge(propietario);
            for (Auto autosOldAuto : autosOld) {
                if (!autosNew.contains(autosOldAuto)) {
                    autosOldAuto.setPropietario(null);
                    autosOldAuto = em.merge(autosOldAuto);
                }
            }
            for (Auto autosNewAuto : autosNew) {
                if (!autosOld.contains(autosNewAuto)) {
                    Propietario oldPropietarioOfAutosNewAuto = autosNewAuto.getPropietario();
                    autosNewAuto.setPropietario(propietario);
                    autosNewAuto = em.merge(autosNewAuto);
                    if (oldPropietarioOfAutosNewAuto != null && !oldPropietarioOfAutosNewAuto.equals(propietario)) {
                        oldPropietarioOfAutosNewAuto.getAutos().remove(autosNewAuto);
                        oldPropietarioOfAutosNewAuto = em.merge(oldPropietarioOfAutosNewAuto);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = propietario.getId();
                if (findPropietario(id) == null) {
                    throw new NonexistentEntityException("The propietario with id " + id + " no longer exists.");
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
            Propietario propietario;
            try {
                propietario = em.getReference(Propietario.class, id);
                propietario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The propietario with id " + id + " no longer exists.", enfe);
            }
            ArrayList<Auto> autos = propietario.getAutos();
            for (Auto autosAuto : autos) {
                autosAuto.setPropietario(null);
                autosAuto = em.merge(autosAuto);
            }
            em.remove(propietario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Propietario> findPropietarioEntities() {
        return findPropietarioEntities(true, -1, -1);
    }

    public List<Propietario> findPropietarioEntities(int maxResults, int firstResult) {
        return findPropietarioEntities(false, maxResults, firstResult);
    }

    private List<Propietario> findPropietarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Propietario.class));
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

    public Propietario findPropietario(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Propietario.class, id);
        } finally {
            em.close();
        }
    }

    public int getPropietarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Propietario> rt = cq.from(Propietario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
