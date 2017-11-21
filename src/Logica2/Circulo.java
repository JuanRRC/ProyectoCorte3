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
public class Circulo extends Coordenada{
    private float radio;
    public Circulo(){
        super();
        this.radio  = 0;
        
    }
    public Circulo(Coordenada nueva, float r){
        super(nueva);
        this.radio = r;
    }
    public Circulo(Circulo cir){
        super(cir);
        this.radio = cir.radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float r) {
        this.radio = r;
    }
    
    
    public Coordenada getCentro(){
        Coordenada nueva = new Coordenada (this.getX(),this.getY());
        return nueva;
    }
}
