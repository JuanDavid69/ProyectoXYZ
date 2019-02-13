/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.CarritoVen;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class DaoCarritoVen {
    FachadaBD fachada;
    
    public DaoCarritoVen() {
        fachada = new FachadaBD();
    }
    
    public void guardarProducto(CarritoVen cv){
        String sql_guardar;
        sql_guardar = "INSERT INTO carritoVen(id_venta, id_producto, cantidad, subtotal) VALUES('" + 
                cv.getId_venta() + "', '" + cv.getId_producto() + "', " + cv.getCantidad() + 
                ", " + cv.getSubtotal() + ")";
        try{
            Connection conn= fachada.conectar();
            Statement sentencia = conn.createStatement();             
            if(sentencia.executeUpdate(sql_guardar)==1){
                System.out.println("producto registrado");
            }else{
                System.out.println("Error");
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){ 
            System.out.println(e); 
        }        
    }
    
    public void restarProducto(String id_producto, int peticion){
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
            int valorActualizado = cantidad - peticion;
              
            sql_modificar = "UPDATE inventario SET cantidad=" + valorActualizado + " WHERE id_producto ='" + id_producto + "'";
            sentencia.executeQuery(sql_modificar);
        }
        catch(Exception e){
            System.out.println(e);
        }       
    }
    
}
