/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;
import Modelo.Sedes;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author juandavid
 */
public class DaoSedes {
    FachadaBD fachada;

    public DaoSedes() {
        fachada = new FachadaBD();
    }
    
    public String guardarSede(Sedes s){
        String sql_guardar;
        sql_guardar = "INSERT INTO sedes(id_sede, nombre, direccion, ciudad, telefono) VALUES('" + 
                s.getId_sede() + "', '" + s.getNombre() + "', '" + s.getDireccion() + "', '" + s.getCiudad() + "', '" + s.getTelefono() + "')";
        try{
            Connection conn= fachada.conectar();
            Statement sentencia = conn.createStatement();             
            if(sentencia.executeUpdate(sql_guardar)==1){
                return "Sede creada correctamente";
            }else{
                return "Error: No se insertó la sede";
            }
        }
        catch(SQLException e){
            System.out.println(e);
            return "Ya existe una sede con ese id";
        }
        catch(Exception e){ 
            System.out.println(e); 
            return "Ha ocurrido un error al crear la sede";
        }        
    }
    
    public String[] consultarSede(String id){
        String sql_select;        
        String consulta[] = new String[5];
        sql_select = "SELECT * FROM sedes WHERE id_sede = " + id;
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
    
    public String modificarSede(Sedes s){
        String sql_modificar;
        sql_modificar = "UPDATE sedes SET nombre = '" + s.getNombre() +"', direccion='" + s.getDireccion() + "', ciudad='" + 
                s.getCiudad() + "', telefono='" + s.getTelefono() + "' WHERE id_sede = " + s.getId_sede();
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if(sentencia.executeUpdate(sql_modificar)==1){
                return "Sede modificada exitosamente";
            }else{
                return "No existe una sede con ese id";
            }            
        }catch(Exception e){
            System.out.println(e);
            return "Ha ocurrido un error al modificar la sede";
        }
    }
    
    public String eliminarSede(String id){
        String sql_delete;
        sql_delete = "DELETE FROM sedes WHERE id_sede= " + id;
        
        try{
            Connection conn= fachada.getConnetion();       
            Statement sentencia = conn.createStatement();            
            if(sentencia.executeUpdate(sql_delete)==1){
                return "Sede eliminada exitosamente";
            }else{
                return "No se eliminó la sede";
            }                
        }catch(Exception e){
            System.out.println(e);
            return "Ocurrió un problema al eliminar la sede";
        }                             
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
}
