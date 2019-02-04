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
    private String id_cotizacion;
    private String id_producto;
    private String id_vendedor;
    private int cantidad;
    private String fecha;
    private int total;

    public String getId_cotizacion() {
        return id_cotizacion;
    }

    public void setId_cotizacion(String id_cotizacion) {
        this.id_cotizacion = id_cotizacion;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(String id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Cotizacion(String id_cotizacion, String id_producto, String id_vendedor, int cantidad, String fecha, int total) {
        this.id_cotizacion = id_cotizacion;
        this.id_producto = id_producto;
        this.id_vendedor = id_vendedor;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.total = total;
    }
}   
