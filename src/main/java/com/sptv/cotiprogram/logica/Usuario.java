package com.sptv.cotiprogram.logica;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private int id;
    @ManyToMany
    @JoinTable(name = "usuario_rol",
               joinColumns = @JoinColumn(name = "idusuario"),
               inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> rol;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "contraseña")
    private String contraseña;
    
    public Usuario() {}
    
    public Usuario(int id , Set<Rol> rol,String nombre,String contraseña){
        this.id = id;
        this.rol = rol;
        this.nombre  = nombre;
        this.contraseña = contraseña;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public Set<Rol> getRol(){
        return rol;
    }
    public void setRol(Set<Rol>rol){
        this.rol = rol;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getContraseña(){
        return contraseña;
    }
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
}
