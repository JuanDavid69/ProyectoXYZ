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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author juandavid
 */
public class DaoOrden {
    DefaultTableModel tabla;
    FachadaBD fachada;

    public DaoOrden() {
        fachada = new FachadaBD();
    }
    
    public String guardarOrden(Orden o){
        String sql_guardar;
        sql_guardar = "INSERT INTO ordenes(id_orden, id_jefe, id_producto, cantidad, fecha, estado) VALUES('" + 
                o.getId_orden() + "', '" + o.getId_jefe() + "', '" + o.getId_producto() + "', " + o.getCantidad() + ", '" + 
                o.getFecha() + "', 'Sin aprobar')";
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
        String consulta[] = new String[6];
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
    
    public String modificarOrden(Orden o){
        String sql_modificar;
        sql_modificar = "UPDATE ordenes SET id_jefe='" + o.getId_jefe() + "', id_producto='" + 
                o.getId_producto() + "', cantidad=" + o.getCantidad() + ", fecha ='" + o.getFecha() + 
                "' WHERE id_orden = '" + o.getId_orden() + "'";
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
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
    
    public DefaultTableModel cargarOrdenes(String busqueda){
        String [] Titulo = {"CODIGO","CEDULA JEFE","PRODUCTO","CANTIDAD","FECHA","ESTADO"};
        tabla=new DefaultTableModel(null,Titulo);
        String sql_select;        
        String consulta[] = new String[6];
        sql_select = "SELECT * FROM ordenes WHERE (id_orden) ilike '%" +busqueda + "%' and estado = 'Sin aprobar'";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql_select);   
            
            while(rs.next()){
                consulta[0] = rs.getString(1);
                consulta[1] = rs.getString(2);
                consulta[2] = rs.getString(3);
                consulta[3] = rs.getString(4);
                consulta[4] = rs.getString(5);
                consulta[5] = rs.getString(6);
                tabla.addRow(consulta);
            }
            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public DefaultTableModel cargarTodasOrdenes(String busqueda){
        String [] Titulo = {"CODIGO", "ESTADO"};
        tabla=new DefaultTableModel(null,Titulo);
        String sql_select;        
        String consulta[] = new String[6];
        sql_select = "SELECT * FROM ordenes WHERE (id_orden) ilike '%" + busqueda + "%'";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql_select);   
            
            while(rs.next()){
                consulta[0] = rs.getString(1);
                consulta[1] = rs.getString(6);
                tabla.addRow(consulta);
            }
            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public void sumarProducto(String id_producto, int peticion){
        String sql_select;
        String consulta = "";
        sql_select = "SELECT cantidad FROM inventario WHERE id_producto = '" + id_producto + "'";
        String sql_modificar;
        
        try{
            Connection conn= fachada.conectar();
            Statement sentencia = conn.createStatement(); 
             ResultSet tabla = sentencia.executeQuery(sql_select);   
            
            if(tabla.next()){
                consulta = tabla.getString(1);
            }
            
            int cantidad = Integer.parseInt(consulta);
            int valorActualizado = cantidad + peticion;
              
            sql_modificar = "UPDATE inventario SET cantidad=" + valorActualizado + " WHERE id_producto ='" + id_producto + "'";
            sentencia.executeQuery(sql_modificar);
        }
        catch(Exception e){
            System.out.println(e);
        }       
    }
    
    public String aprobarOrden(String id, String producto, int peticion){
        String sql_modificar;
        sql_modificar = "UPDATE ordenes SET estado='Aprobada' WHERE id_orden = '" + id + "'";
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if(sentencia.executeUpdate(sql_modificar)==1){
                sumarProducto(producto, peticion);
                return "La orden fue aprobada exitosamente";
            }else{
                return "Ha ocurrido un error al aprobar la orden";
            } 
        }catch(Exception e){
            System.out.println(e);
            return "Ha ocurrido un error al modificar la orden";
        }
    }
    
    
    
    
}
    

