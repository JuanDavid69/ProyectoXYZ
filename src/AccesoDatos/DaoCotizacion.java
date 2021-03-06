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
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juandavid
 */
public class DaoCotizacion {
    DefaultTableModel tabla;
    FachadaBD fachada;

    public DaoCotizacion() {
        fachada = new FachadaBD();
    }
    
    public String guardarCotizacion(Cotizacion c){
        String sql_guardar;
        sql_guardar = "INSERT INTO cotizaciones(id_cotizacion, id_vendedor, fecha, total) VALUES('" + 
                c.getId_cotizacion() +  "', '" + c.getId_vendedor() + "', '" + c.getFecha() + "', " + c.getTotal() + ")";
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
        String consulta[] = new String[4];
        sql_select = "SELECT * FROM cotizaciones WHERE id_cotizacion = '" + id + "'";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);   
            
            if(tabla.next()){
                consulta[0] = tabla.getString(1);
                consulta[1] = tabla.getString(2);
                consulta[2] = tabla.getString(3);
                consulta[3] = tabla.getString(4);  
            }else{
                consulta = null;
            }
            return consulta;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public ArrayList cargarCotizaciones(){
        String sql_select;
        ArrayList<String> cotizaciones = new ArrayList<String>();
        int i = 0;
        sql_select = "SELECT id_cotizacion FROM cotizaciones ORDER BY id_cotizacion";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);   
            
            while(tabla.next()){
                cotizaciones.add(tabla.getString(1));
                i++;  
            }
            return cotizaciones;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    
    
    public String modificarCotizacion(Cotizacion c){
        String sql_modificar;
        sql_modificar = "UPDATE cotizaciones SET id_vendedor='" + c.getId_vendedor() +
                "', fecha='" + c.getFecha() + "', total=" + c.getTotal() +
                " WHERE id_cotizacion = '" + c.getId_cotizacion() + "'";
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
        sql_delete = "DELETE FROM cotizaciones WHERE id_cotizacion = '" + id + "'";
        
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
    
    public DefaultTableModel cargarInfoCotizaciones(String busqueda){
        String [] Titulo = {"N° COTIZACION","CEDULA VENDEDOR","FECHA","TOTAL"};
        tabla=new DefaultTableModel(null,Titulo);
        String sql_select;        
        String consulta[] = new String[4];
        sql_select = "SELECT * FROM cotizaciones WHERE (id_cotizacion) ilike '%" +busqueda + "%' ORDER BY id_cotizacion";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql_select);   
            
            while(rs.next()){
                consulta[0] = rs.getString(1);
                consulta[1] = rs.getString(2);
                consulta[2] = rs.getString(3);
                consulta[3] = rs.getString(4);
                tabla.addRow(consulta);
            }
            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public String generarIdCotizacion(){
        String sql_select;        
        String id_cotizacion = "001"; 
        sql_select = "SELECT MAX(id_cotizacion) FROM cotizaciones";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);   
            
            if(tabla.next()){
                if(tabla.getString(1) != null){
                    int codigo = Integer.parseInt(tabla.getString(1)) + 1;
                    if((codigo >= 100) && (codigo < 1000)){
                        id_cotizacion = Integer.toString(codigo);
                    }
                    if((codigo >= 10) && (codigo < 100)){
                        id_cotizacion = "0" + codigo;
                    }
                    if(codigo <= 9){
                        id_cotizacion = "00" + codigo;
                    }
                }else{
                    id_cotizacion = "001";
                }
            }else{
                id_cotizacion = "001";
            }
            return id_cotizacion;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
}
