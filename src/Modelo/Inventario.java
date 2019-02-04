/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author juandavid
 */
public class Inventario {
    private int id_producto;
    private String producto;
    private int cantidad;    
    private float precio_unidad;
    
    public Inventario(int id_producto, String producto, int cantidad, float precio_unidad){
        this.id_producto = id_producto;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio_unidad = precio_unidad;
    }

    public int getId_producto() {
        return id_producto;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio_unidad() {
        return precio_unidad;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_unidad(float precio_unidad) {
        this.precio_unidad = precio_unidad;
    }       
}
