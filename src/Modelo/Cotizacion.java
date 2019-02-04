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
public class Cotizacion {
    private int id_cotizacion;
    private int id_producto;
    private String id_vendedor;
    private int cantidad;
    private String fecha;
    private float total;
    
    public Cotizacion(int id_cotizacion, int id_producto, String id_vendedor, int cantidad, String fecha, int total) {
        this.id_cotizacion = id_cotizacion;
        this.id_producto = id_producto;
        this.id_vendedor = id_vendedor;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId_cotizacion() {
        return id_cotizacion;
    }

    public int getId_producto() {
        return id_producto;
    }

    public String getId_vendedor() {
        return id_vendedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setId_cotizacion(int id_cotizacion) {
        this.id_cotizacion = id_cotizacion;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setId_vendedor(String id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}   
