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
public class Venta {
    private String id_venta;
    private String id_vendedor;
    private String fecha;
    private float total;
    private String id_sede;

    public Venta(String id_venta, String id_vendedor, String fecha, float total, String id_sede) {
        this.id_venta = id_venta;
        this.id_vendedor = id_vendedor;
        this.fecha = fecha;
        this.total = total;
        this.id_sede = id_sede;
    }

    public String getId_venta() {
        return id_venta;
    }

    public String getId_vendedor() {
        return id_vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public float getTotal() {
        return total;
    }
    
    public void setId_vendedor(String id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getId_sede() {
        return id_sede;
    }

    public void setId_sede(String id_sede) {
        this.id_sede = id_sede;
    }
    
}
