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
public class NaveGrafico extends Nave implements Dibujable {

    Color color;
    
    public NaveGrafico(Coordenada a, Coordenada b, Coordenada c, Color uncolor){
        super(a,b,c);
        this.color=uncolor;
                }
    
    
    /**
     * poligono dibujado sera la nave
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
    
    /**
     * se mueve la coordenada y se pinta 
     * @param dw
     * @param uncolor 
     */
    public void Pintar(Graphics dw,Color uncolor) {
        dw.setColor(uncolor);
        int x[] ={(int)this.getX(),(int)cor1.getX(),(int)cor2.getX()};
        int y[] ={(int)this.getY(),(int)cor1.getY(),(int)cor2.getY()};
        
        Polygon p = new Polygon(x,y,3);
          dw.fillPolygon(p);
    }
    /**
     * metodo que generara el disparo
     * @return 
     */
    public CirculoGrafico Bala1(){
        Coordenada salida = new Coordenada(this.getX(),this.getY());
        CirculoGrafico bala = new  CirculoGrafico(salida,10,Color.RED);
        return bala;
    }
    /**
     * metodo modifica lo creado
     */
    public void Ciclo(){
        for(int i=0; i<this.balas.size();i++){
            CirculoGrafico y = (CirculoGrafico) this.balas.get(i);
            float x = y.getY();
            y.setY(x-=5);//velocidad y vala hacia arriva
        }
    }
}
