/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Inventario;
import AccesoDatos.*;
/**
 *
 * @author juandavid
 */
public class ControlInventario {
    DaoInventario daoInventario;
    
    public ControlInventario() {
        daoInventario= new DaoInventario();
    }
    
    public String agregarInventario (int id_producto, String producto, int cantidad, float precio_unidad) {
        Inventario i = new Inventario(id_producto, producto, cantidad, precio_unidad);
        return daoInventario.guardarInventario(i);
    }
    
    public String[] consultarInventario(String id){
        return daoInventario.consultarInventario(id);
    }
    
    public String modificarInventario(int id_producto, String producto, int cantidad, float precio_unidad){
        Inventario i = new Inventario(id_producto, producto, cantidad, precio_unidad);
        return daoInventario.modificarInvetario(i);
    }
    
    public String eliminarInvetario (String id){
        return daoInventario.eliminarInvetario(id);
    }
    
    public void cerrarConexionBD(){
        daoInventario.cerrarConexionBD();
    }
}
