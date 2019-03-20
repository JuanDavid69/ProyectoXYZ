/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Cotizacion;
import AccesoDatos.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author juandavid
 */
public class ControlCotizacion {
    DaoCotizacion daoCotizacion;
    
    public ControlCotizacion() {
        daoCotizacion = new DaoCotizacion();
    }
    
    public String agregarCotizacion (String id_cotizacion, String id_vendedor, String fecha, float total) {
        Cotizacion c = new Cotizacion(id_cotizacion, id_vendedor, fecha, total);
        return daoCotizacion.guardarCotizacion(c);
    }
    
    public String[] consultarCotizacion(String id){
        return daoCotizacion.consultarCotizacion(id);
    }
    
    public String modificarCotizacion(String id_cotizacion, String id_vendedor, String fecha, float total){
        Cotizacion u = new Cotizacion(id_cotizacion, id_vendedor, fecha, total);
        return daoCotizacion.modificarCotizacion(u);
    }
    
    public String eliminarCotizacion (String id){
        return daoCotizacion.eliminarCotizacion(id);
    }
    
    public ArrayList cargarCotizaciones(){
        return daoCotizacion.cargarCotizaciones();
    }
    
    public DefaultTableModel cargarInfoCotizaciones(String busqueda){
        return daoCotizacion.cargarInfoCotizaciones(busqueda);
    }
    
    public String generarIdCotizacion(){
        return daoCotizacion.generarIdCotizacion();
    }
    
    public void cerrarConexionBD(){
        daoCotizacion.cerrarConexionBD();
    }
}
