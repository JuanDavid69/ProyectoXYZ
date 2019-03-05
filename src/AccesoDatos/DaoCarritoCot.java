/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.CarritoCot;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author juandavid
 */
public class DaoCarritoCot {
    DefaultTableModel tabla;
    FachadaBD fachada;
    
    public DaoCarritoCot() {
        fachada = new FachadaBD();
    }
    
    public void guardarProducto(CarritoCot cc){
        String sql_guardar;
        sql_guardar = "INSERT INTO carritoCot(id_cotizacion, id_producto, cantidad, subtotal) VALUES('" + 
                cc.getId_cotizacion() + "', '" + cc.getId_producto() + "', " + cc.getCantidad() + 
                ", " + cc.getSubtotal() + ")";
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
    
    public DefaultTableModel cargarProductosCot(String id_cotizacion){
        String [] Titulo = {"CODIGO","PRODUCTO","CANTIDAD","PRECIO UNIDAD", "SUBTOTAL"};
        tabla=new DefaultTableModel(null,Titulo);
        String sql_select;        
        String consulta[] = new String[5];
        sql_select = "SELECT carritoCot.id_producto,inventario.producto,carritoCot.cantidad, precio_unidad,subtotal \n" +
                        "FROM carritoCot FULL JOIN inventario ON carritoCot.id_cotizacion = '" + id_cotizacion +"'\n" +
                            "WHERE carritoCot.id_producto = inventario.id_producto";
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
}
