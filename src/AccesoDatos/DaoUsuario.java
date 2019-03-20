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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juandavid
 */
public class DaoUsuario {
    DefaultTableModel tabla;
    FachadaBD fachada;

    public DaoUsuario() {
        fachada = new FachadaBD();
    }
    
    public String guardarUsuario(Usuario u){
        String sql_guardar;
        sql_guardar = "INSERT INTO usuarios VALUES('" + u.getCedula()+ "', '" + 
                u.getPassword()+ "', '" + u.getEstado() + "', '" + u.getNombre() + "', '" +
                u.getCargo() + "', '" +  u.getSalario() + "', '" + u.getFecha() + "', '" + 
                u.getDireccion() + "', '" + u.getId_sede() + "', '" + u.getTelefono() + "')";
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
            return "Ha ocurrido un error al crear el usuario";
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
                "', fecha='" + u.getFecha() + "', direccion='" + u.getDireccion() + "', id_sede='" + u.getId_sede() + 
                "', telefono='" + u.getTelefono() + "' WHERE cedula = '" + u.getCedula() + "'";
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
    
    public String[] verificar(String cedula, String password){
        String sql_select;        
        String consulta[] = new String[2];
        sql_select = "SELECT cargo,estado FROM usuarios WHERE cedula = '" + cedula + "' and password = '" + password + "'";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);   
            
            if(tabla.next()){
                consulta[0] = tabla.getString(1);
                consulta[1] = tabla.getString(2);     
            }else{
                consulta[0] = "El usuario o la contraseña son incorrectos";
                consulta[1] = "";
            }
            return consulta;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public boolean verificarSede(String sede, String cedula){
        String sql_select; 
        sql_select = "SELECT id_sede,cedula FROM usuarios WHERE id_sede = '" + sede + "' and cargo = 'Gerente'";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);   
            
            if(tabla.next()){
                if((tabla.getString(2).equals(cedula)) && (tabla.getString(1).equals(sede))){
                    return false;
                }else{
                    return true;
                } 
            }else{
                return false;
            }
        }catch(Exception e){
            System.out.println(e);
            return true;
        }
    }
    
    public boolean verificarSedeInactiva(String sede){
        String sql_select; 
        sql_select = "SELECT estado FROM sedes WHERE id_sede = '" + sede + "'";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select); 
            
            if(tabla.next()){
                if(tabla.getString(1).equals("Inactiva")){
                        return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }catch(Exception e){
            System.out.println(e);
            return true;
        }
    }
    
    public DefaultTableModel cargarUsuarios(String busqueda){
        String [] Titulo = {"CEDULA","NOMBRE"};
        tabla=new DefaultTableModel(null,Titulo);
        String sql_select;        
        String consulta[] = new String[2];
        sql_select = "SELECT * FROM usuarios WHERE (nombre) ilike '%" +busqueda + "%' ORDER BY cedula";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql_select);   
            
            while(rs.next()){
                consulta[0] = rs.getString(1);
                consulta[1] = rs.getString(4);
                tabla.addRow(consulta);
            }
            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public DefaultTableModel cargarUsuariosActivos(String busqueda){
        String [] Titulo = {"CEDULA","NOMBRE"};
        tabla=new DefaultTableModel(null,Titulo);
        String sql_select;        
        String consulta[] = new String[2];
        sql_select = "SELECT * FROM usuarios WHERE (nombre) ilike '%" +busqueda + "%' and estado = 'Activo' and cargo != 'Gerente' ORDER BY cedula";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql_select);   
            
            while(rs.next()){
                consulta[0] = rs.getString(1);
                consulta[1] = rs.getString(4);
                tabla.addRow(consulta);
            }
            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public DefaultTableModel cargarUsuariosInactivos(String busqueda){
        String [] Titulo = {"CEDULA","NOMBRE","ESTADO","EX-CARGO","SALARIO","DIRECCION","SEDE","TELEFONO"};
        tabla=new DefaultTableModel(null,Titulo);
        String sql_select;        
        String consulta[] = new String[8];
        sql_select = "SELECT * FROM usuarios WHERE (nombre) ilike '%" +busqueda + "%' and estado = 'Inactivo' and cargo != 'Gerente' ORDER BY cedula";
        try{
            Connection conn= fachada.getConnetion();            
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql_select);   
            
            while(rs.next()){
                consulta[0] = rs.getString(1);
                consulta[1] = rs.getString(4);
                consulta[2] = rs.getString(3);
                consulta[3] = rs.getString(5);
                consulta[4] = rs.getString(6);
                consulta[5] = rs.getString(8);
                consulta[6] = rs.getString(9);
                consulta[7] = rs.getString(10);
                tabla.addRow(consulta);
            }
            return tabla;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public String desactivarUsuario(String cedula){
        String sql_modificar;
        sql_modificar = "UPDATE usuarios SET estado='Inactivo' WHERE cedula = '" + cedula + "'";
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if(sentencia.executeUpdate(sql_modificar)==1){
                return "Usuario desctivado exitosamente";
            }else{
                return "No existe un usuario con ese id";
            }            
        }catch(Exception e){
            System.out.println(e);
            return "Ha ocurrido un error al desactivar el usuario";
        }
    }
    
    public String activarUsuario(String cedula){
        String sql_modificar;
        sql_modificar = "UPDATE usuarios SET estado='Activo' WHERE cedula = '" + cedula + "'";
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            if(sentencia.executeUpdate(sql_modificar)==1){
                return "Usuario activado exitosamente";
            }else{
                return "No existe un usuario con ese id";
            }            
        }catch(Exception e){
            System.out.println(e);
            return "Ha ocurrido un error al activar el usuario";
        }
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
}
