package com.sptv.cotiprogram.persistencia;

import com.sptv.cotiprogram.logica.Rol;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class RolJpaController implements Serializable {
        public RolJpaController(EntityManagerFactory emf){
        this.emf = emf;
    }
    public RolJpaController(){
        emf = Persistence.createEntityManagerFactory("CotiPU");
    }
    private EntityManagerFactory emf = null;
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Rol rol) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(rol);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Rol rol) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            rol = em.merge(rol);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw new Exception("Error al editar el usuario " + rol.getId(), ex);
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
            Rol rol;
            try {
                rol = em.getReference(Rol.class, id);
                rol.getId();
            } catch (Exception ex) {
                throw new Exception("El rol con id " + id + " no existe.", ex);
            }
            em.remove(rol);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Rol findRol(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Rol.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    public Rol findRolByUsername(String username) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Rol> query = em.createQuery("SELECT r FROM Rol r WHERE u.nombre = :nombre", Rol.class);
            query.setParameter("nombre", username);
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
