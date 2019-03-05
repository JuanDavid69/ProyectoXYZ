/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import AccesoDatos.DaoCarritoVen;
import Modelo.CarritoVen;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ControlCarritoVen {
    DaoCarritoVen daoCarritoVen;
    
    public ControlCarritoVen() {
        daoCarritoVen = new DaoCarritoVen();
    }
    
    public void agregarProducto (String id_venta, String id_producto, int cantidad, float subtotal) {
        CarritoVen cv = new CarritoVen(id_venta, id_producto, cantidad, subtotal);
        daoCarritoVen.guardarProducto(cv);
    }
    
    public void restarProducto (String id_producto, int cantidad){
        daoCarritoVen.restarProducto(id_producto, cantidad);
    }
    
    public DefaultTableModel cargarProductosVen(String id_venta){
        return daoCarritoVen.cargarProductosVen(id_venta);
    }
}
