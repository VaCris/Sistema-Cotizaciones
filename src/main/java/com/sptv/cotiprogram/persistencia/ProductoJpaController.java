package com.sptv.cotiprogram.persistencia;

import com.sptv.cotiprogram.logica.Producto;

import javax.persistence.*;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class ProductoJpaController {
    private EntityManagerFactory emf = null;

    public ProductoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("CotiPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Producto producto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Producto producto) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            producto = em.merge(producto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw new Exception("Error al editar el producto con ID " + producto.getId(), ex);
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
            Producto producto;
            try {
                producto = em.getReference(Producto.class, id);
                producto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("El producto con ID " + id + " no existe.", enfe);
            }
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Producto findProducto(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductoEntities() {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT p FROM Producto p");
            return query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductosByName(String descripcion) {
    EntityManager em = getEntityManager();
    try {
        Query query = em.createQuery("SELECT p FROM Producto p WHERE p.descripcion LIKE :descripcion");
        query.setParameter("descripcion", "%" + descripcion + "%");
        return query.getResultList();
    } finally {
        if (em != null) {
            em.close();
            }
        }
    }


    public int getProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<Producto> rt = cq.from(Producto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
