/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Sedes;
import AccesoDatos.*;
/**
 *
 * @author juandavid
 */
public class ControlSedes {
    DaoSedes daoSedes;
    
    public ControlSedes() {
        daoSedes= new DaoSedes();
    }
    
    public String agregarSede (int id_sede, String direccion, String ciudad, String telefono) {
        Sedes s = new Sedes(id_sede, direccion, ciudad, telefono);
        return daoSedes.guardarSede(s);
    }
    
    public String[] consultarSede(String id){
        return daoSedes.consultarSede(id);
    }
    
    public String modificarSede(int id_sede, String direccion, String ciudad, String telefono){
        Sedes s = new Sedes(id_sede, direccion, ciudad, telefono);
        return daoSedes.modificarSede(s);
    }
    
    public String eliminarSede (String id){
        return daoSedes.eliminarSede(id);
    }
    
    public void cerrarConexionBD(){
        daoSedes.cerrarConexionBD();
    }
}
