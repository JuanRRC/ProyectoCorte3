/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import Logica.Recreacionista;

/**
 *
 * @author Clint
 */
public class Usuarios {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String fecha;
    private String fechaR;
    private String foto;

    public Usuarios(String nombre, String apellido, int edad, String cedula, String fecha,String fechaR,String foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.fecha = fecha;
        this.fechaR=fechaR;
        this.foto=foto;
    }
    
     public static Usuarios crear(String nombre, String apellido, int edad, String cedula,String fecha,String fechaR,String foto) {
        return new Usuarios(nombre,apellido,edad,cedula,fecha,fechaR,foto);
        
    }
    

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    
    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
