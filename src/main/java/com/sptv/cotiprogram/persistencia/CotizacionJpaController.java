package com.sptv.cotiprogram.persistencia;


import com.sptv.cotiprogram.logica.Cotizacion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CotizacionJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public CotizacionJpaController() {
        this.emf = Persistence.createEntityManagerFactory("CotiPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cotizacion cotizacion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cotizacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cotizacion cotizacion) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cotizacion = em.merge(cotizacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw new Exception("Error al editar la cotización " + cotizacion.getId(), ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cotizacion cotizacion;
            try {
                cotizacion = em.getReference(Cotizacion.class, id);
                cotizacion.getId();
            } catch (Exception ex) {
                throw new Exception("La cotización con id " + id + " no existe.", ex);
            }
            em.remove(cotizacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Cotizacion findCotizacion(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cotizacion.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cotizacion> findCotizacionEntities() {
        return findCotizacionEntities(true, -1, -1);
    }

    public List<Cotizacion> findCotizacionEntities(int maxResults, int firstResult) {
        return findCotizacionEntities(false, maxResults, firstResult);
    }

    private List<Cotizacion> findCotizacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cotizacion.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    


    public int getCotizacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cotizacion> rt = cq.from(Cotizacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    void pdfcotizacion(Cotizacion cotizacion) {
        
    }
}