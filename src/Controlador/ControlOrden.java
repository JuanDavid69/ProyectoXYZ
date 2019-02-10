/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Orden;
import AccesoDatos.*;
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
    
    public String aprobarOrden(String id_orden, String id_jefe, String id_producto, int cantidad, String fecha, String estado){
        Orden o = new Orden(id_orden, id_jefe, id_producto, cantidad, fecha, estado);
        return daoOrden.aprobarOrden(o);
    }
    
    public void cerrarConexionBD(){
        daoOrden.cerrarConexionBD();
    }
}
