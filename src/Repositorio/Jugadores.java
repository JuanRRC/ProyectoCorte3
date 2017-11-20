/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

/**
 *
 * @author Clint
 */
public class Jugadores {
 
    private String nombreU;
    private int contraseña;

    public Jugadores(String nombreU, int contraseña) {
        this.nombreU = nombreU;
        this.contraseña = contraseña;
    }

    public static Jugadores crear(int contraseña,String nombreU) {
        return new Jugadores(nombreU,contraseña);
        
    }
    
    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    
    
    
}
