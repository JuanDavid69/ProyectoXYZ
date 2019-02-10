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
    private String id_vendedor;
    private String fecha;
    private float total;
    
    public Cotizacion(String id_cotizacion, String id_vendedor, String fecha, float total) {
        this.id_cotizacion = id_cotizacion;
        this.id_vendedor = id_vendedor;
        this.fecha = fecha;
        this.total = total;
    }

    public String getId_cotizacion() {
        return id_cotizacion;
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
}   
