/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Venta;
import AccesoDatos.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juandavid
 */
public class ControlVenta {
    DaoVenta daoVenta;
    
    public ControlVenta() {
        daoVenta = new DaoVenta();
    }
    
    public String agregarVenta (String id_venta, String id_vendedor, String fecha, float total, String id_sede) {
        Venta c = new Venta(id_venta, id_vendedor, fecha, total, id_sede);
        return daoVenta.guardarVenta(c);
    }
    
    public String[] consultarVenta(String id){
        return daoVenta.consultarVenta(id);
    }
    
    public String modificarVenta(String id_venta, String id_vendedor, String fecha, float total){
        Venta u = new Venta(id_venta, id_vendedor, fecha, total, "");
        return daoVenta.modificarVenta(u);
    }
    
    public String eliminarVenta (String id){
        return daoVenta.eliminarVenta(id);
    }
    
    public ArrayList cargarVentas(){
        return daoVenta.cargarVentas();
    }
    
    public DefaultTableModel cargarInfoVentas(String busqueda){
        return daoVenta.cargarInfoVentas(busqueda);
    }
    
    public boolean verificarVenta(String id_producto, int peticion){
        return daoVenta.verificarVenta(id_producto, peticion);
    }
    public DefaultTableModel ventasSede(String start, String end){
        return daoVenta.ventasSede(start, end);
    }
    public DefaultTableModel ventasVendedor(String start, String end){
        return daoVenta.ventasVendedor(start, end);
    }
    
    public DefaultTableModel gananciasSedes(String start, String end){
        return daoVenta.gananciasSedes(start, end);
    }
    
    public DefaultTableModel productosVendidos(String start, String end){
        return daoVenta.productosVendidos(start, end);
    }
    
    public DefaultTableModel gananciaAnual(String year){
        return daoVenta.gananciaAnual(year);
    }
    
    public String generarIdVenta(){
        return daoVenta.generarIdVenta();
    }
    
    public void cerrarConexionBD(){
        daoVenta.cerrarConexionBD();
    }
}
