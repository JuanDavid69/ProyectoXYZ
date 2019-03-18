/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Orden;
import AccesoDatos.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author juandavid
 */
public class ControlOrden {
    DaoOrden daoOrden;
    
    public ControlOrden() {
        daoOrden= new DaoOrden();
    }
    
    public String agregarOrden (String id_orden, String id_jefe, String id_producto, int cantidad, String fecha, String estado) {
        Orden o = new Orden(id_orden, id_jefe, id_producto, cantidad, fecha, estado);
        return daoOrden.guardarOrden(o);
    }
    
    public String[] consultarOrden(String id){
        return daoOrden.consultarOrden(id);
    }
    
    public String modificarOrden(String id_orden, String id_jefe, String id_producto, int cantidad, String fecha, String estado){
        Orden o = new Orden(id_orden, id_jefe, id_producto, cantidad, fecha, estado);
        return daoOrden.modificarOrden(o);
    }
    
    public String eliminarOrden (String id){
        return daoOrden.eliminarOrden(id);
    }
    
    public String aprobarOrden(String id_orden, String producto, int peticion){
        return daoOrden.aprobarOrden(id_orden, producto, peticion);
    }
    
    public DefaultTableModel cargarOrdenes(String busqueda){
        return daoOrden.cargarOrdenes(busqueda);
    }
    
    public DefaultTableModel cargarTodasOrdenes(String busqueda){
        return daoOrden.cargarTodasOrdenes(busqueda);
    }
    
    public String generarIdOrden(){
        return daoOrden.generarIdOrden();
    }
    
    public void cerrarConexionBD(){
        daoOrden.cerrarConexionBD();
    }
}
