/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Grafico.NaveGrafico;
import Grafico.Panel;
import Grafico.RectanguloGrafico;
import Grafico.Ventana;
import Logica2.Coordenada;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class main {
    public static int Aleatorio(int Max,int Min){
        return(int)(Math.random() * (Max-Min));
    }
    public static void main(String[] args){
        Ventana nuestraventana = new Ventana("juego");
        ArrayList ArregloDeobjetos = new ArrayList();
        Coordenada cor1 = new Coordenada(250,250);
        Coordenada cor2 = new Coordenada(350,350);
        
        //nave
        Coordenada cor3 = new Coordenada(475,500);//punta
        Coordenada cor4 = new Coordenada(425,575);//izquierda
        Coordenada cor5 = new Coordenada(525,575);//derecha
        
        NaveGrafico nave = new NaveGrafico(cor3,cor4,cor5,Color.YELLOW);
        
        //RectanguloGrafico rectangulo = new RectanguloGrafico(cor1,80,80,Color.RED);
        //CirculoGrafico circulo = new CirculoGrafico(cor2,50,Color.CYAN);
        
       // ArregloDeobjetos.add(rectangulo);
         //ArregloDeobjetos.add(circulo);
       
       
       Coordenada Salida = new Coordenada(0,0);//se crean balas hacia abajp  rango  eje x
       RectanguloGrafico Asteriode = new RectanguloGrafico(Salida,25,25,Color.BLUE);
          ArregloDeobjetos.add(nave);
          
       
       Coordenada Salida1 = new Coordenada(0,0);//se crean balas hacia abajp  rango  eje x
       RectanguloGrafico Asteriode1 = new RectanguloGrafico(Salida1,25,25,Color.BLUE);
          ArregloDeobjetos.add(nave);
     
       Coordenada Salida2 = new Coordenada(0,0);//se crean balas hacia abajp  rango  eje x
       RectanguloGrafico Asteriode2 = new RectanguloGrafico(Salida2,25,25,Color.BLUE);
          ArregloDeobjetos.add(nave);
          
       
       Coordenada Salida3 = new Coordenada(0,0);//se crean balas hacia abajp  rango  eje x
       RectanguloGrafico Asteriode3 = new RectanguloGrafico(Salida3,25,25,Color.BLUE);
          ArregloDeobjetos.add(nave);
          
       
       Coordenada Salida4 = new Coordenada(0,0);//se crean balas hacia abajp  rango  eje x
       RectanguloGrafico Asteriode4 = new RectanguloGrafico(Salida4,25,25,Color.BLUE);
       ArregloDeobjetos.add(Asteriode);
       ArregloDeobjetos.add(Asteriode1);
       ArregloDeobjetos.add(Asteriode2);
       ArregloDeobjetos.add(Asteriode3);
       ArregloDeobjetos.add(Asteriode4);
          ArregloDeobjetos.add(nave);
        
       Panel nuestroPanel = new Panel(ArregloDeobjetos);
      
       nuestroPanel.refNave(nave);
       
       nuestroPanel.refAst(Asteriode, Asteriode1, Asteriode2, Asteriode3, Asteriode4);
        nuestraventana.add(nuestroPanel);
        nuestraventana.setSize(700,600);
        nuestraventana.setBackground(Color.darkGray);
        nuestraventana.setVisible(true);
        nuestroPanel.run ();
        
        
    }
}
