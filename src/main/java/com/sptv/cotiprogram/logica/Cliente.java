package com.sptv.cotiprogram.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private String direccion;
	private String telefono;
	private String ruc;
	
	public Cliente(int id, String nombre, String direccion, String telefono, String ruc) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.ruc = ruc;
	}

        public Cliente() {
        }

           	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	
	
}
