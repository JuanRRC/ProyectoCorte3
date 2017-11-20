/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

/**
 *
 * @author JUAN DAVID
 */
import Logica2.Circulo;
import Logica2.Coordenada;
import Logica2.Dibujable;
import java.awt.Color;
import java.awt.Graphics;
public class CirculoGrafico extends Circulo implements Dibujable {
       
    Color color;
    
    /**
     *  Constructor coordenada del circulo mas el color 
     * @param cor
     * @param radio
     * @param uncolor 
     */
      public CirculoGrafico(Coordenada cor,float radio, Color uncolor){
      super(cor,radio);
      this.color= uncolor;
    }
      /**
       * agarra la coordenada la resta con el radio se castea y es un parametro
       * y hace lo mismos con cada parametro
       * @param dw 
       */
    @Override
    public void dibujar(Graphics dw) {
         dw.setColor(color);
         dw.fillOval((int)(this.getX()-this.getRadio()),(int)(this.getY()-this.getRadio()),(int)(2*this.getRadio()) ,(int)(2*this.getRadio()) );
    }
     public void Pintar(Color a){
        this.color=a;
    }
}
