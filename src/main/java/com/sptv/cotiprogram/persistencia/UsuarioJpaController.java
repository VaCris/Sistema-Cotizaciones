package com.sptv.cotiprogram.persistencia;

import com.sptv.cotiprogram.logica.Usuario;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class UsuarioJpaController implements Serializable {
    
    public UsuarioJpaController(EntityManagerFactory emf){
        this.emf = emf;
    }
    public UsuarioJpaController(){
        emf = Persistence.createEntityManagerFactory("CotiPU");
    }
    private EntityManagerFactory emf = null;
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Usuario usuario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Usuario usuario) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            usuario = em.merge(usuario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw new Exception("Error al editar el usuario " + usuario.getId(), ex);
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
            Usuario usuario;
            try {
                usuario = em.getReference(Usuario.class, id);
                usuario.getId();
            } catch (Exception ex) {
                throw new Exception("El usuario con id " + id + " no existe.", ex);
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Usuario findUsuario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    public Usuario findUsuarioByUsername(String username) {
    EntityManager em = getEntityManager();
    try {
        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nombre = :nombre", Usuario.class);
        query.setParameter("nombre", username);
        return query.getSingleResult();
    } catch (NoResultException ex) {
        return null;
    } finally {
        if (em != null) {
            em.close();
        }
    }
}

    
}
