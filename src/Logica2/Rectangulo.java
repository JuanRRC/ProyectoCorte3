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
public class Rectangulo extends Coordenada {
      
    private float lado1;
    private float lado2;
    /**
     * constructor por defecto  no manda ningun atributo
     */
      public Rectangulo(){
        super();
        this.lado1 = 0;
        this.lado2 = 0;
        
    }
      /**
       * constructor con coordenada donde se ba a cituar y los parametros
       * @param cor
       * @param x
       * @param y 
       */
     public Rectangulo(Coordenada cor, float x,float y){
        super(cor);
        this.lado1 = x;
        this.lado2 = y;
    }
     /**
      * crea coordenada con la que ya tiene el parametro
      * @param nuevo 
      */
     public Rectangulo(Rectangulo nuevo){
        super(nuevo.getX(),nuevo.getY());
        this.lado1 = nuevo.lado1;
        this.lado2 = nuevo.lado2;
    }
     /**
      * retorna los lados que contiene el rectangulo
      * @param lado
      * @return 
      */
         public float Getlado(int lado){
        if(lado == 1){
            return this.lado1;
        }
        if(lado == 2){
            return this.lado2;
        }
        if(lado != 1 && lado != 2){
            return 0;
        }
        return 0;
    }
}
