/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Orden;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author juandavid
 */
public class DaoOrden {
    FachadaBD fachada;

    public DaoOrden() {
        fachada = new FachadaBD();
    }
    
    public String guardarOrden(Orden o){
        String sql_guardar;
        sql_guardar = "INSERT INTO ordenes(id_orden, id_jefe, id_producto, cantidad, fecha, estado) VALUES('" + 
                o.getId_orden() + "', '" + o.getId_jefe() + "', " + o.getId_producto() + ", " + o.getCantidad() + ", '" + 
                o.getFecha() + "', 'no aprobado')";
        try{
            Connection conn= fachada.conectar();
            Statement sentencia = conn.createStatement();             
            if(sentencia.executeUpdate(sql_guardar)==1){
                return "Orden creada correctamente";
            }else{
                return "Error: No se insertó la orden";
            }
        }
        catch(SQLException e){
            System.out.println(e);
            return "Ya existe una orden con ese id";
        }
        catch(Exception e){ 
            System.out.println(e); 
            return "Ha ocurrido un error al crear la orden";
        }        
    }
    
    public String[] consultarOrden(String id){
        String sql_select;        
        String consulta[] = new String[5];
        sql_select = "SELECT * FROM ordenes WHERE id_orden = '" + id + "'";
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
            }else{
                consulta = null;
            }
            return consulta;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public String modificarOrden(Orden o){
        String sql_modificar;
        sql_modificar = "UPDATE ordenes SET id_jefe='" + o.getId_jefe() + "', id_producto='" + 
                o.getId_producto() + "', cantidad=" + o.getCantidad() + ", fecha ='" + o.getFecha() + 
                "', estado = 'no aprobado' WHERE id_orden = '" + o.getId_orden() + "'";
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if(sentencia.executeUpdate(sql_modificar)==1){
                return "Orden modificada exitosamente";
            }else{
                return "No existe una orden con ese id";
            }            
        }catch(Exception e){
            System.out.println(e);
            return "Ha ocurrido un error al modificar la orden";
        }
    }
    
    public String eliminarOrden(String id){
        String sql_delete;
        sql_delete = "DELETE FROM ordenes WHERE id_orden= '" + id + "'";
        
        try{
            Connection conn= fachada.getConnetion();       
            Statement sentencia = conn.createStatement();            
            if(sentencia.executeUpdate(sql_delete)==1){
                return "Orden eliminada exitosamente";
            }else{
                return "No se eliminó la orden";
            }                
        }catch(Exception e){
            System.out.println(e);
            return "Ocurrió un problema al eliminar la orden";
        }                             
    }
    
    public String aprobarOrden(Orden o){
        String sql_modificar;
        sql_modificar = "UPDATE ordenes SET id_jefe='" + o.getId_jefe() + "', id_producto='" + 
                o.getId_producto() + "', cantidad=" + o.getCantidad() + ", fecha ='" + o.getFecha() + 
                "', estado = 'aprobado' WHERE id_orden = '" + o.getId_orden() + "'";
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if(sentencia.executeUpdate(sql_modificar)==1){
                return "Orden modificada exitosamente";
            }else{
                return "No existe una orden con ese id";
            }            
        }catch(Exception e){
            System.out.println(e);
            return "Ha ocurrido un error al modificar la orden";
        }
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
}
