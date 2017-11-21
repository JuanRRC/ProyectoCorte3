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
    public Coordenada(){
        this.x =0;
        this.y =0;
        
    }
    /**
     * controla las coordenas "movimientos"
     * @param x
     * @param y 
     */
    public Coordenada(float x, float y ){
        this.x =x;
        this.y =y;
        
    }
    public Coordenada(Coordenada nueva){
        this.x =nueva.x;
        this.y =nueva.y;
        
    }

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
    
    /**
     * se suma coordenada especifica y se le retorna al metodo mever
     * @param S
     * @return 
     */
    public Coordenada Suma(Coordenada S){
      float Sumx = this.x+S.getX();
      float Sumy = this.y+S.getY();
        Coordenada Cor = new Coordenada(Sumx,Sumy);
        return Cor;
    
    }
    
}
