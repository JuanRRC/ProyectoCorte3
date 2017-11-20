/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import Logica2.Coordenada;
import Logica2.Dibujable;
import Logica2.Rectangulo;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author JUAN DAVID
 */
public class RectanguloGrafico extends Rectangulo implements Dibujable {

     Color color;
    /**
     * constructor con color que contendra el rectangulo
     * @param cor
     * @param x
     * @param y
     * @param uncolor 
     */
    public RectanguloGrafico(Coordenada cor, float x, float y, Color uncolor){
        super(cor,x,y);
        this.color=uncolor;
    }
    
    
    
    
    /**
     * dibujara el  objeto
     * @param dw 
     */
    
    @Override
    public void dibujar(Graphics dw) {
         dw.setColor(color);
        dw.fillRect((int)this.getX(),(int)this.getY(),(int)this.Getlado(1),(int)this.Getlado(2));
    }
    
}
