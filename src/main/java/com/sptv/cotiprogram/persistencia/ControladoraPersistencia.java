package com.sptv.cotiprogram.persistencia;

import com.sptv.cotiprogram.logica.Cliente;
import com.sptv.cotiprogram.logica.Cotizacion;
import com.sptv.cotiprogram.logica.Producto;
import com.sptv.cotiprogram.logica.Usuario;
import static java.lang.Integer.SIZE;
import java.util.List;


public class ControladoraPersistencia {

    private final ClienteJpaController clienteJpa = new ClienteJpaController();
    private final ProductoJpaController productoJpa = new ProductoJpaController();
    private final CotizacionJpaController cotizacionJpa = new CotizacionJpaController();
    private final UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    private final RolJpaController rolJpa = new RolJpaController();
    
    public void agregarCliente(Cliente cliente) {
        clienteJpa.create(cliente);
    }
    public void editarCliente(Cliente cliente) throws Exception{
        clienteJpa.edit(cliente);
    }
    public void borrarCliente(Cliente cliente) throws Exception{
        clienteJpa.destroy(SIZE);
    }
    public List<Cliente> obtenerCliente(Cliente cliente){
        return clienteJpa.findClienteEntities();
    }
    public void agregarProducto(Producto producto){
        productoJpa.create(producto);
    }
    public void editarProducto(Producto producto) throws Exception{
        productoJpa.edit(producto);
    }
    public void borrarProducto(Producto producto) throws Exception{
        productoJpa.destroy(SIZE);
    }
    public List<Producto> obtenerProducto (String descripcion){
        return productoJpa.findProductosByName(descripcion);
    }
    public int cantidadProducto(Producto producto){
        return productoJpa.getProductoCount();
    }
    public void agregarCotizacion (Cotizacion cotizacion){
        cotizacionJpa.create(cotizacion);
    }
    public void agregarUsuario(Usuario usuario){
        usuarioJpa.create(usuario);
    }
    public void editarUsuario(Usuario usuario) throws Exception{
        usuarioJpa.edit(usuario);
    }
    public void borrarUsuario(Usuario usuario) throws Exception{
        usuarioJpa.destroy(SIZE);
    }
    public void buscarUsuario(Usuario usuario){
        usuarioJpa.findUsuario(SIZE);
    }
    public void buscarNombreUsuario(String nombre){
        usuarioJpa.findUsuarioByUsername(nombre);
    }
    public void buscarNombreRol(String nombre){
        rolJpa.findRolByUsername(nombre);
    }
}
