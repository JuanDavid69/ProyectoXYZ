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
public class Orden {
    private int id_orden;
    private String id_jefe;
    private int id_producto;
    private int cantidad;
    private String fecha;
    
    public Orden(int id_orden, String id_jefe, int id_producto, int cantidad, String fecha) {
        this.id_orden = id_orden;
        this.id_jefe = id_jefe;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getId_orden() {
        return id_orden;
    }

    public String getId_jefe() {
        return id_jefe;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public void setId_jefe(String id_jefe) {
        this.id_jefe = id_jefe;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
