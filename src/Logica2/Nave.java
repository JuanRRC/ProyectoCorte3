/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica2;

import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class Nave extends Coordenada{
    public Coordenada cor1 = new Coordenada();//tma el lugar de la coordena izquierda
    public Coordenada cor2 = new Coordenada();//tma el lugar de la coordena derecha
    public  ArrayList balas = new ArrayList();//
    /**
     * la coordenada que se hereda va a tomar el lugar de la nave
     */
    public Nave(){
        super();
        this.cor1.setX(0);
        this.cor1.setY(0);
        
        this.cor2.setX(0);
        this.cor2.setY(0);
        
    }
    /**
     * recibe tres coordenads y genera la nave
     * @param a
     * @param b
     * @param c 
     */
        public Nave(Coordenada a, Coordenada b, Coordenada c){
        super(a.getX(),a.getY());
        this.cor1.setX(b.getX());
        this.cor1.setY(b.getY());
        
        this.cor2.setX(c.getX());
        this.cor2.setY(c.getY());
    }
        /**
         * recibe la nave  por parametro getX y getY y se setea setX y setY
         * @param c 
         */
         public Nave(Nave c){
       super(c.getX(),c.getY()); 
        this.cor1.setX(c.getX());
        this.cor1.setY(c.getY());
        
        this.cor2.setX(c.getX());
        this.cor2.setY(c.getY());
    }
         /**
     * borra y repinta en coordenadas modificadas
     */
    public void setVertice(Coordenada nueva, int lado){
        if(lado == 1){
            this.setX(nueva.getX());
            this.setY(nueva.getY());
        }
                if(lado == 2){
             this.cor1.setX(nueva.getX());
            this.cor1.setY(nueva.getY());
        }
                        if(lado == 3){
            this.cor2.setX(nueva.getX());
            this.cor2.setY(nueva.getY());
        }
    }
     /**
     * se setea en el lado que se quiera
     * @param NvaCor 
     */
    public void mover(Coordenada NvaCor){
        setVertice((this.Suma(NvaCor)),1);
        setVertice((this.cor1.Suma(NvaCor)), 2);
        setVertice((this.cor2.Suma(NvaCor)), 3);
    }
}
