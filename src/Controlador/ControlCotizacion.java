/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Cotizacion;
import AccesoDatos.*;
/**
 *
 * @author juandavid
 */
public class ControlCotizacion {
    DaoCotizacion daoCotizacion;
    
    public ControlCotizacion() {
        daoCotizacion = new DaoCotizacion();
    }
    
    public String agregarCotizacion (int id_cotizacion, int id_producto, String id_vendedor, int cantidad, String fecha, int total) {
        Cotizacion c = new Cotizacion(id_cotizacion, id_producto, id_vendedor, cantidad, fecha, total);
        return daoCotizacion.guardarCotizacion(c);
    }
    
    public String[] consultarCotizacion(String id){
        return daoCotizacion.consultarCotizacion(id);
    }
    
    public String modificarCotizacion(int id_cotizacion, int id_producto, String id_vendedor, int cantidad, String fecha, int total){
        Cotizacion u = new Cotizacion(id_cotizacion, id_producto, id_vendedor, cantidad, fecha, total);
        return daoCotizacion.modificarCotizacion(u);
    }
    
    public String eliminarCotizacion (String id){
        return daoCotizacion.eliminarCotizacion(id);
    }
    
    public void cerrarConexionBD(){
        daoCotizacion.cerrarConexionBD();
    }
}
