package com.sptv.cotiprogram.logica;

import com.sptv.cotiprogram.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarCliente(String nombre, String direccion, String telefono, String ruc) {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setRuc(ruc);
        controlPersis.agregarCliente(cliente);  
    }
    
}
