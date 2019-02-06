/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;
import Modelo.Venta;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author juandavid
 */
public class DaoVenta {
    FachadaBD fachada;

    public DaoVenta() {
        fachada = new FachadaBD();
    }
    
    public String guardarVenta(Venta v){
        String sql_guardar;
        sql_guardar = "INSERT INTO ventas(id_producto, id_vendedor, cantidad, fecha, total) VALUES(" + 
                v.getId_producto() + ", '" + v.getId_vendedor() + "', " + v.getCantidad() + ", '" + v.getFecha() + 
                "', " + v.getTotal() + ")";
        try{
            Connection conn= fachada.conectar();
            Statement sentencia = conn.createStatement();             
            if(sentencia.executeUpdate(sql_guardar)==1){
                return "Venta creada correctamente";
            }else{
                return "Error: No se insertó la venta";
            }
        }
        catch(SQLException e){
            System.out.println(e);
            return "Ya existe una venta con ese id";
        }
        catch(Exception e){ 
            System.out.println(e); 
            return "Ha ocurrido un error al crear la venta";
        }        
    }
    
    public String[] consultarVenta(String id){
        String sql_select;        
        String consulta[] = new String[6];
        sql_select = "SELECT * FROM ventas WHERE id_venta = " + id;
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
    
    public String modificarVenta(Venta v){
        String sql_modificar;
        sql_modificar = "UPDATE ventas SET id_producto=" + v.getId_producto() + ", id_vendedor='" + v.getId_vendedor() +
                "', cantidad=" + v.getCantidad() + ", fecha='" + v.getFecha() + "', total=" + v.getTotal() +
                " WHERE id_venta = " + v.getId_venta();
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if(sentencia.executeUpdate(sql_modificar)==1){
                return "Venta modificada exitosamente";
            }else{
                return "No existe una venta con ese id";
            }            
        }catch(Exception e){
            System.out.println(e);
            return "Ha ocurrido un error al modificar la venta";
        }
    }
    
    public String eliminarVenta(String id){
        String sql_delete;
        sql_delete = "DELETE FROM ventas WHERE id_venta = " + id;
        
        try{
            Connection conn= fachada.getConnetion();       
            Statement sentencia = conn.createStatement();            
            if(sentencia.executeUpdate(sql_delete)==1){
                return "Venta eliminada exitosamente";
            }else{
                return "No se eliminó la venta";
            }                
        }catch(Exception e){
            System.out.println(e);
            return "Ocurrió un problema al eliminar la venta";
        }                             
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
}
