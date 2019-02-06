/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Usuario;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juandavid
 */
public class DaoUsuario {
    FachadaBD fachada;

    public DaoUsuario() {
        fachada = new FachadaBD();
    }
    
    public String guardarUsuario(Usuario u){
        String sql_guardar;
        sql_guardar = "INSERT INTO usuarios VALUES('" + u.getCedula()+ "', '" + 
                u.getPassword()+ "', '" + u.getEstado() + "', '" + u.getNombre() + "', '" +
                u.getCargo() + "', '" +  u.getSalario() + "', '" + u.getFecha() + "', '" + 
                u.getDireccion() + "', " + u.getId_sede() + ", '" + u.getTelefono() + "')";
        try{
            Connection conn= fachada.conectar();
            Statement sentencia = conn.createStatement();             
            if(sentencia.executeUpdate(sql_guardar)==1){
                return "Usuario creado correctamente";
            }else{
                return "Error: No se insertó el usuario";
            }
        }
        catch(SQLException e){
            System.out.println(e);
            return "Ya existe un usuario con ese id";
        }
        catch(Exception e){ 
            System.out.println(e); 
            return "Ha ocurrido un error al crear el usuario";
        }        
    }
    
    public String[] consultarUsuario(String id){
        String sql_select;        
        String consulta[] = new String[10];
        sql_select = "SELECT * FROM usuarios WHERE cedula = '" + id + "'";
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
                consulta[6] = tabla.getString(7);
                consulta[7] = tabla.getString(8);
                consulta[8] = tabla.getString(9);
                consulta[9] = tabla.getString(10);    
            }else{
                consulta = null;
            }
            return consulta;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public String modificarUsuario(Usuario u){
        String sql_modificar;
        sql_modificar = "UPDATE usuarios SET password='" + u.getPassword() + "', estado='" + u.getEstado() +
                "', nombre='" + u.getNombre() + "', cargo='" + u.getCargo() + "', salario='" + u.getSalario() +
                "', fecha='" + u.getFecha() + "', direccion='" + u.getDireccion() + "', id_sede=" + u.getId_sede() + 
                ", telefono='" + u.getTelefono() + "' WHERE cedula = '" + u.getCedula() + "'";
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if(sentencia.executeUpdate(sql_modificar)==1){
                return "Usuario modificado exitosamente";
            }else{
                return "No existe un usuario con ese id";
            }            
        }catch(Exception e){
            System.out.println(e);
            return "Ha ocurrido un error al modificar el usuario";
        }
    }
    
    public String eliminarUsuario(String id){
        String sql_delete;
        sql_delete = "DELETE FROM usuarios WHERE cedula = '" + id + "'";
        
        try{
            Connection conn= fachada.getConnetion();       
            Statement sentencia = conn.createStatement();            
            if(sentencia.executeUpdate(sql_delete)==1){
                return "Usuario eliminado exitosamente";
            }else{
                return "No se eliminó el usuario";
            }                
        }catch(Exception e){
            System.out.println(e);
            return "Ocurrió un problema al eliminar el usuario";
        }                             
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
}