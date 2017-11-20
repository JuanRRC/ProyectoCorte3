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
import Logica2.Coordenada;
import Logica2.Dibujable;
import Logica2.Nave;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
public class NaveGrafico extends Nave implements Dibujable  {
      
     Color color;
    /**
     * contienen coordenadas y el color de el objeto 
     * @param a
     * @param b
     * @param c
     * @param uncolor 
     */
    public NaveGrafico(Coordenada a, Coordenada b, Coordenada c, Color uncolor){
        super(a,b,c);
        this.color=uncolor;
                }
    
    
    
    
    /**
     * poligono dibujado sera la nave los dos arreglos tienen las coordenadas en x y en Y
     * @param dw 
     */
    @Override
    public void dibujar(Graphics dw) {
        dw.setColor(color);
        int x[] ={(int)this.getX(),(int)cor1.getX(),(int)cor2.getX()};
        int y[] ={(int)this.getY(),(int)cor1.getY(),(int)cor2.getY()};
        
        Polygon p = new Polygon(x,y,3);
          dw.fillPolygon(p);
    }
    
}
