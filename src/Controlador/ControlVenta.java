/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Venta;
import AccesoDatos.*;

/**
 *
 * @author juandavid
 */
public class ControlVenta {
    DaoVenta daoVenta;
    
    public ControlVenta() {
        daoVenta = new DaoVenta();
    }
    
    public String agregarVenta (int id_venta, int id_producto, String id_vendedor, int cantidad, String fecha, int total) {
        Venta c = new Venta(id_venta, id_producto, id_vendedor, cantidad, fecha, total);
        return daoVenta.guardarVenta(c);
    }
    
    public String[] consultarVenta(String id){
        return daoVenta.consultarVenta(id);
    }
    
    public String modificarVenta(int id_venta, int id_producto, String id_vendedor, int cantidad, String fecha, int total){
        Venta u = new Venta(id_venta, id_producto, id_vendedor, cantidad, fecha, total);
        return daoVenta.modificarVenta(u);
    }
    
    public String eliminarVenta (String id){
        return daoVenta.eliminarVenta(id);
    }
    
    public void cerrarConexionBD(){
        daoVenta.cerrarConexionBD();
    }
}
