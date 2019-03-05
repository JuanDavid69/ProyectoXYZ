/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.DaoCarritoCot;
import Modelo.CarritoCot;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juandavid
 */
public class ControlCarritoCot {
    DaoCarritoCot daoCarritoCot;
    
    public ControlCarritoCot() {
        daoCarritoCot = new DaoCarritoCot();
    }
    
    public void agregarProducto (String id_cotizacion, String id_producto, int cantidad, float subtotal) {
        CarritoCot cc = new CarritoCot(id_cotizacion, id_producto, cantidad, subtotal);
        daoCarritoCot.guardarProducto(cc);
    }
    
    public DefaultTableModel cargarProductosCot(String id_cotizacion){
        return daoCarritoCot.cargarProductosCot(id_cotizacion);
    }
}
