/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;
import Logica2.Dibujable;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author JUAN DAVID
 */
public class Panel extends JPanel {
        ArrayList v;
     /**
     * CONTIENE EL POLIGONO v
     */
    /**
 * constructor de la clase panel recive una lista 
 * van a venir los objetos a dibujar en el panel desde el main se hara mas  adelante
 * @param vectordeO 
 */
    public Panel(ArrayList vectordeO){
        this.v = vectordeO;
     
        
    }
    /**
     * metodo recibe como parametro un grafico 
     */
     public void paint(Graphics g){
        // dara un entero de la cantidad de objetos que tenga el arreglo
        // dibuja a medida que tenga el arreglo de objetos
        Dibujable dib;
        for (int i=0;i<v.size();i++){
            dib =(Dibujable)v.get(i);
            dib.dibujar(g);
            
        }
        
    }
}
