/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Usuario;
import AccesoDatos.*;

/**
 *
 * @author juandavid
 */
public class ControlUsuario {
    DaoUsuario daoUsuario;
    
    public ControlUsuario() {
        daoUsuario = new DaoUsuario();
    }
    
    public String agregarUsuario (String cedula, String password, String estado, String nombre, String cargo, String salario, String fecha, String direccion, int id_sede, String telefono) {
        Usuario u = new Usuario(cedula, password, estado, nombre, cargo, salario, fecha, direccion, id_sede, telefono);
        return daoUsuario.guardarUsuario(u);
    }
    
    public String[] consultarUsuario(String cedula){
        return daoUsuario.consultarUsuario(cedula);
    }
    
    public String modificarUsuario(String cedula, String password, String estado, String nombre, String cargo, String salario, String fecha, String direccion, int id_sede, String telefono){
        Usuario u = new Usuario(cedula, password, estado, nombre, cargo, salario, fecha, direccion, id_sede, telefono);
        return daoUsuario.guardarUsuario(u);
    }
    
    public String eliminarUsuario (String cedula){
        return daoUsuario.eliminarUsuario(cedula);
    }
    
    public void cerrarConexionBD(){
        daoUsuario.cerrarConexionBD();
    }
}
