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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class DaoCarritoVen {
    DefaultTableModel tabla;
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
    
    public DefaultTableModel cargarProductosVen(String id_venta){
        String [] Titulo = {"CODIGO","PRODUCTO","CANTIDAD","PRECIO UNIDAD", "SUBTOTAL"};
        tabla=new DefaultTableModel(null,Titulo);
        String sql_select;        
        String consulta[] = new String[5];
        sql_select = "SELECT carritoVen.id_producto,inventario.producto,carritoVen.cantidad, precio_unidad,subtotal \n" +
                        "FROM carritoVen FULL JOIN inventario ON carritoVen.id_venta = '" + id_venta +"'\n" +
                            "WHERE carritoVen.id_producto = inventario.id_producto";
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
                tabla.addRow(consulta);
            }
            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public void eliminarProductos(String id){
        String sql_delete;
        sql_delete = "DELETE FROM carritoVen WHERE id_venta = '" + id + "'";
        
        try{
            Connection conn= fachada.getConnetion();       
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_delete);            
                      
        }catch(Exception e){
            System.out.println(e);
        }                             
    }
    
}
