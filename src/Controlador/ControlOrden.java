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
    
    public String agregarOrden (int id_orden, String id_jefe, int id_producto, int cantidad, String fecha) {
        Orden o = new Orden(id_orden, id_jefe, id_producto, cantidad, fecha);
        return daoOrden.guardarOrden(o);
    }
    
    public String[] consultarOrden(String id){
        return daoOrden.consultarOrden(id);
    }
    
    public String modificarOrden(int id_orden, String id_jefe, int id_producto, int cantidad, String fecha){
        Orden o = new Orden(id_orden, id_jefe, id_producto, cantidad, fecha);
        return daoOrden.modificarOrden(o);
    }
    
    public String eliminarOrden (String id){
        return daoOrden.eliminarOrden(id);
    }
    
    public void cerrarConexionBD(){
        daoOrden.cerrarConexionBD();
    }
}
