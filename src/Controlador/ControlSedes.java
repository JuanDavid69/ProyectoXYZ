/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Sedes;
import AccesoDatos.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author juandavid
 */
public class ControlSedes {
    DaoSedes daoSedes;
    
    public ControlSedes() {
        daoSedes= new DaoSedes();
    }
    
    public String agregarSede (String id_sede, String nombre, String direccion, String ciudad, String telefono) {
        Sedes s = new Sedes(id_sede, nombre, direccion, ciudad, telefono, "Activa");
        return daoSedes.guardarSede(s);
    }
    
    public String[] consultarSede(String id){
        return daoSedes.consultarSede(id);
    }
    
    public String modificarSede(String id_sede, String nombre, String direccion, String ciudad, String telefono){
        Sedes s = new Sedes(id_sede, nombre, direccion, ciudad, telefono, "Activa");
        return daoSedes.modificarSede(s);
    }
    
    public String eliminarSede (String id){
        return daoSedes.eliminarSede(id);
    }
    
    public DefaultTableModel cargarSedes(String busqueda, String estado){
        return daoSedes.cargarSedes(busqueda, estado);
    }
    
    public String desactivarSede(String id){
        return daoSedes.desactivarSede(id);
    }
    
    public String activarSede(String id){
        return daoSedes.activarSede(id);
    }
    
    public String generarIdSede(){
        return daoSedes.generarIdSede();
    }
    
    public void cerrarConexionBD(){
        daoSedes.cerrarConexionBD();
    }
}
