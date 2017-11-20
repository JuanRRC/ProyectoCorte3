/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica2;

/**
 *
 * @author JUAN DAVID
 */
public class Coordenada {
    private float x;
    private float y;
    /**
     * metodo para coordenada sin atrivutos
     */
    public Coordenada(){
        this.x =0;
        this.y =0;
        
    } 
     /**
     * controla las coordenas "movimientos" que el usuario dessee
     * @param x
     * @param y 
     */
    public Coordenada(float x, float y ){
        this.x =x;
        this.y =y;
        
    }
    /**
     * manejara coordenas nuevas 
     * @param nueva 
     */
       public Coordenada(Coordenada nueva){
        this.x =nueva.x;
        this.y =nueva.y;
        
    }
       /**
        * 
        * metodos que daran y retornaran las coordenanas
        */
       public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
