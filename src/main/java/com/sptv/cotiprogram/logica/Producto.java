
package com.sptv.cotiprogram.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto implements Serializable{
        @Id
        @GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String codigo;
	private String descripcion;
	private String marca;
	private int cantidad;
	private double PunitSinIGV;
	private double PunitConIGV;
	
	public Producto(int id,String codigo, String descripcion, String marca, int cantidad, double punitSinIGV,double punitConIGV) {
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.marca = marca;
		this.cantidad = cantidad;
		this.PunitSinIGV = punitSinIGV;
		this.PunitConIGV = punitConIGV;
	}
	public Producto(){
            
        }
	public double getTotalSinIGV() {
	     return PunitSinIGV * cantidad;
	}

	public double getTotalConIGV() {
	      return PunitConIGV * cantidad;
	}
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
        
	public double getPunitSinIGV() {
		return PunitSinIGV;
	}

	public void setPunitSinIGV(double punitSinIGV) {
		PunitSinIGV = punitSinIGV;
	}

	public double getPunitConIGV() {
		return PunitConIGV;
	}

	public void setPunitConIGV(double punitConIGV) {
		PunitConIGV = punitConIGV;
	}
       
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
