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
/**
 *
 * @author juandavid
 */
public class DaoCarritoCot {
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
}
