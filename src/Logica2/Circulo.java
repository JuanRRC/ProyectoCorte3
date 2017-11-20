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
    //radio del circulo
     private float radio;
     /**
      * constructor
      */
    public Circulo(){
        super();
        this.radio  = 0;
        
    }
    /**
     * recibe radio y coordenada
     * @param nueva
     * @param r 
     */
       public Circulo(Coordenada nueva, float r){
        super(nueva);
        this.radio = r;
    }
       /**
        * constructor con circulo 
        * @param cir 
        */
        public Circulo(Circulo cir){
        super(cir);
        this.radio = cir.radio;
    }
        /**
         * se usara por si se llega a necesesitar en otra parte el 
         * radio de el circulo
         */
    public float getRadio() {
        return radio;
    }

    public void setRadio(float r) {
        this.radio = r;
    }
    /**
     * retornara la coordenada con el centro de el circulo
     */
     public Coordenada getCentro(){
        Coordenada nueva = new Coordenada (this.getX(),this.getY());
        return nueva;
    }
}
