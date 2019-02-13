/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class CarritoVen {
    private String id_venta;
    private String id_producto;
    private int cantidad;
    private float subtotal;

    public CarritoVen(String id_venta, String id_producto, int cantidad, float subtotal) {
        this.id_venta = id_venta;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public String getId_venta() {
        return id_venta;
    }

    public String getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
}
