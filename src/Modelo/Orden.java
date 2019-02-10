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
    private String id_orden;
    private String id_jefe;
    private String id_producto;
    private int cantidad;
    private String fecha;
    private String estado;
    
    public Orden(String id_orden, String id_jefe, String id_producto, int cantidad, String fecha, String estado) {
        this.id_orden = id_orden;
        this.id_jefe = id_jefe;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getId_orden() {
        return id_orden;
    }

    public String getId_jefe() {
        return id_jefe;
    }

    public String getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFecha() {
        return fecha;
    }
    
    public String getEstado(){
        return estado;
    }

    public void setId_jefe(String id_jefe) {
        this.id_jefe = id_jefe;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }

}
