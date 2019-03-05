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
    
    public String agregarVenta (String id_venta, String id_vendedor, String fecha, float total) {
        Venta c = new Venta(id_venta, id_vendedor, fecha, total);
        return daoVenta.guardarVenta(c);
    }
    
    public String[] consultarVenta(String id){
        return daoVenta.consultarVenta(id);
    }
    
    public String modificarVenta(String id_venta, String id_vendedor, String fecha, float total){
        Venta u = new Venta(id_venta, id_vendedor, fecha, total);
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
    
    public void cerrarConexionBD(){
        daoVenta.cerrarConexionBD();
    }
}
