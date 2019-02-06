/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Inventario;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author juandavid
 */
public class DaoInventario {
    FachadaBD fachada;

    public DaoInventario() {
        fachada = new FachadaBD();
    }
    
    public String guardarInventario(Inventario i){
        String sql_guardar;
        sql_guardar = "INSERT INTO inventario(producto, cantidad, precio_unidad) VALUES('" + 
                i.getProducto() + "', " + i.getCantidad() + ", " + i.getPrecio_unidad() + ")";
        try{
            Connection conn= fachada.conectar();
            Statement sentencia = conn.createStatement();             
            if(sentencia.executeUpdate(sql_guardar)==1){
                return "Producto creado correctamente";
            }else{
                return "Error: No se insertó el producto";
            }
        }
        catch(SQLException e){
            System.out.println(e);
            return "Ya existe un producto con ese id";
        }
        catch(Exception e){ 
            System.out.println(e); 
            return "Ha ocurrido un error al crear el producto";
        }        
    }
    
    public String[] consultarInventario(String id){
        String sql_select;        
        String consulta[] = new String[4];
        sql_select = "SELECT * FROM inventario WHERE id_producto = " + id;
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
    
    public String modificarInvetario(Inventario i){
        String sql_modificar;
        sql_modificar = "UPDATE inventario SET id_producto='" + i.getProducto() + "', id_cantidad=" + 
                i.getCantidad() + ", precio_unidad=" + i.getPrecio_unidad() + " WHERE id_producto = " + i.getId_producto();
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if(sentencia.executeUpdate(sql_modificar)==1){
                return "Producto modificado exitosamente";
            }else{
                return "No existe un producto con ese id";
            }            
        }catch(Exception e){
            System.out.println(e);
            return "Ha ocurrido un error al modificar el producto";
        }
    }
    
    public String eliminarInvetario(String id){
        String sql_delete;
        sql_delete = "DELETE FROM inventario WHERE id_producto= " + id;
        
        try{
            Connection conn= fachada.getConnetion();       
            Statement sentencia = conn.createStatement();            
            if(sentencia.executeUpdate(sql_delete)==1){
                return "Producto eliminado exitosamente";
            }else{
                return "No se eliminó el producto";
            }                
        }catch(Exception e){
            System.out.println(e);
            return "Ocurrió un problema al eliminar el producto";
        }                             
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
}
