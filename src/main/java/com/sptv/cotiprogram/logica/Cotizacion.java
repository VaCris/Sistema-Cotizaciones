package com.sptv.cotiprogram.logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cotizacion implements Serializable {
    private static double IGV = 0.18;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private int numcoti;
    private Date fecha;
    private double total;
    @ManyToOne
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cotizacion_id")
    private List<Producto> productos;
    private String estado;
    
    public Cotizacion(double IGV,int id, Date fecha, double total, Cliente cliente, List<Producto> productos, String estado) {
        this.IGV = IGV;
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.cliente = cliente;
        this.productos = productos;
        this.estado = estado;
    }
    public void agregarProductos(Producto producto) {
        productos.add(producto);
    }
	
    public double calcularTotalSinIGV() {
	return productos.stream().mapToDouble(Producto::getTotalSinIGV).sum();
    }
    public double calcularTotalConIGV() {
	return productos.stream().mapToDouble(Producto::getTotalConIGV).sum();
    }
    public Cotizacion() {
    }
    public double getIGV() {
	return IGV;  
    }
    public void setIGV(double IGV) {
	this.IGV = IGV;
    }
    public int getId() {
	return id;  
    }
    public void setId(int id) {
	this.id = id;
    }
    public Date getFecha() {
	return fecha;
    }
    public void setFecha(Date fecha) {
	this.fecha = fecha;
    }
    public double getTotal() {
	return total;
    }
    public void setTotal(double total) {
	this.total = total;
    }
    public Cliente getCliente() {
	return cliente;
    }
    public void setCliente(Cliente cliente) {
	this.cliente = cliente;
    }
    public List<Producto> getProductos() {
	return productos;
    }
    public void setProductos(List<Producto> productos) {
	this.productos = productos;
    }
    public String getEstado() {
	return estado;
    }
    public void setEstado(String estado) {
	this.estado = estado;
    }
}

