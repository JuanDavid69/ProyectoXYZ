/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Usuario;
import AccesoDatos.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juandavid
 */
public class ControlUsuario {
    DaoUsuario daoUsuario;
    
    public ControlUsuario() {
        daoUsuario = new DaoUsuario();
    }
    
    public String agregarUsuario (String cedula, String password, String estado, String nombre, String cargo, String salario, String fecha, String direccion, String id_sede, String telefono) {
        Usuario u = new Usuario(cedula, password, estado, nombre, cargo, salario, fecha, direccion, id_sede, telefono);
        if(daoUsuario.verificarSedeInactiva(id_sede)){
            return "La sede que seleccionó está incativa";
        }else{
            if(cargo.equals("Gerente")){
                if(daoUsuario.verificarSede(id_sede, cedula)){
                    return "La sede que seleccionó ya tiene un gerente a cargo";
                }else{
                    return daoUsuario.guardarUsuario(u);
                }
            }
            else{
                return daoUsuario.guardarUsuario(u);
            }
        }
    }
    
    public String[] consultarUsuario(String cedula){
        return daoUsuario.consultarUsuario(cedula);
    }
    
    public String modificarUsuario(String cedula, String password, String estado, String nombre, String cargo, String salario, String fecha, String direccion, String id_sede, String telefono){
        Usuario u = new Usuario(cedula, password, estado, nombre, cargo, salario, fecha, direccion, id_sede, telefono);
        if(daoUsuario.verificarSedeInactiva(id_sede)){
            return "La sede que seleccionó está incativa";
        }else{
            if(cargo.equals("Gerente")){
                if(daoUsuario.verificarSede(id_sede, cedula)){
                    return "La sede que seleccionó ya tiene un gerente a cargo";
                }
                {
                     return daoUsuario.modificarUsuario(u);
                }
            }else{
                 return daoUsuario.modificarUsuario(u);
            }
        }
    }
    
    public String eliminarUsuario (String cedula){
        return daoUsuario.eliminarUsuario(cedula);
    }
    
    public String[] verificarUsuario(String cedula, String password) {
        return daoUsuario.verificar(cedula, password);
    }
    
    public DefaultTableModel cargarUsuarios(String busqueda){
        return daoUsuario.cargarUsuarios(busqueda);
    }
    
    public DefaultTableModel cargarUsuariosActivos(String busqueda){
        return daoUsuario.cargarUsuariosActivos(busqueda);
    }
    
    public DefaultTableModel cargarUsuariosiInactivos(String busqueda){
        return daoUsuario.cargarUsuariosInactivos(busqueda);
    }
    
    public DefaultTableModel cargarVendedores(){
         return daoUsuario.cargarVendedores();
    }
    
    public String desactivarUsuario(String cedula){
        return daoUsuario.desactivarUsuario(cedula);
    }
    
    public String activarUsuario(String cedula){
        return daoUsuario.activarUsuario(cedula);
    }
    
    public void cerrarConexionBD(){
        daoUsuario.cerrarConexionBD();
    }
}
