/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Cotizacion;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juandavid
 */
public class DaoCotizacion {
    
    FachadaBD fachada;

    public DaoCotizacion() {
        fachada = new FachadaBD();
    }
    
    public String guardarCotizacion(Cotizacion c){
        String sql_guardar;
        sql_guardar = "INSERT INTO cotizaciones(id_producto, id_vendedor, cantidad, fecha, total) VALUES(" + 
                c.getId_producto() + ", '" + c.getId_vendedor() + "', " + c.getCantidad() + ", '" + c.getFecha() + 
                "', " + c.getTotal() + ")";
        try{
            Connection conn= fachada.conectar();
            Statement sentencia = conn.createStatement();             
            if(sentencia.executeUpdate(sql_guardar)==1){
                return "Cotizacion creada correctamente";
            }else{
                return "Error: No se insertó la cotizacion";
            }
        }
        catch(SQLException e){
            System.out.println(e);
            return "Ya existe una cotizacion con ese id";
        }
        catch(Exception e){ 
            System.out.println(e); 
            return "Ha ocurrido un error al crear la cotizacion";
        }        
    }
    
    public String[] consultarCotizacion(String id){
        String sql_select;        
        String consulta[] = new String[6];
        sql_select = "SELECT * FROM cotizaciones WHERE id_cotizacion = " + id;
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);   
            
            if(tabla.next()){
                consulta[0] = tabla.getString(1);
                consulta[1] = tabla.getString(2);
                consulta[2] = tabla.getString(3);
                consulta[3] = tabla.getString(4);
                consulta[4] = tabla.getString(5);
                consulta[5] = tabla.getString(6);   
            }else{
                consulta = null;
            }
            return consulta;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public String modificarCotizacion(Cotizacion c){
        String sql_modificar;
        sql_modificar = "UPDATE cotizaciones SET id_producto=" + c.getId_producto() + ", id_vendedor='" + c.getId_vendedor() +
                "', cantidad=" + c.getCantidad() + ", fecha='" + c.getFecha() + "', total=" + c.getTotal() +
                " WHERE id_cotizacion = " + c.getId_cotizacion();
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if(sentencia.executeUpdate(sql_modificar)==1){
                return "Cotizacion modificada exitosamente";
            }else{
                return "No existe una cotizacion con ese id";
            }            
        }catch(Exception e){
            System.out.println(e);
            return "Ha ocurrido un error al modificar la cotizacion";
        }
    }
    
    public String eliminarCotizacion(String id){
        String sql_delete;
        sql_delete = "DELETE FROM cotizaciones WHERE id_cotizacion = " + id;
        
        try{
            Connection conn= fachada.getConnetion();       
            Statement sentencia = conn.createStatement();            
            if(sentencia.executeUpdate(sql_delete)==1){
                return "Cotizacion eliminada exitosamente";
            }else{
                return "No se eliminó la cotizacion";
            }                
        }catch(Exception e){
            System.out.println(e);
            return "Ocurrió un problema al eliminar la cotizacion";
        }                             
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
}
