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
    private String nProducto;
    private String idProducto;
    private String valor;    
    private String cantidadDisponible;
    
    public Inventario(String nProducto,String idProducto,String valor,String cantidadDisponible){
        this.nProducto=nProducto;
        this.idProducto=idProducto;
        this.valor=valor;
        this.cantidadDisponible=cantidadDisponible;
    }
    
    public String GetNProducto(){
        return nProducto;
    }
    
    public String GetIdProducto(){
        return idProducto;
    }
    
    public String GetValor(){
        return valor;
    }
    
    public String GetCantidadDisponible(){
        return cantidadDisponible;
    }
    
}
