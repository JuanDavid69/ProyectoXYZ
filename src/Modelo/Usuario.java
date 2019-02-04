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
public class Usuario {
  private String cedula;
  private String password; 
  private String estado; 
  private String nombre; 
  private String cargo; 
  private String salario; 
  private String fecha; 
  private String direccion; 
  private int id_sede; 
  private String telefono;

    public Usuario(String cedula, String password, String estado, String nombre, String cargo, String salario, String fecha, String direccion, int id_sede, String telefono) {
        this.cedula = cedula;
        this.password = password;
        this.estado = estado;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fecha = fecha;
        this.direccion = direccion;
        this.id_sede = id_sede;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public String getPassword() {
        return password;
    }

    public String getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getSalario() {
        return salario;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getId_sede() {
        return id_sede;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
