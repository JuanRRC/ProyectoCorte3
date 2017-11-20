/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Grafico.NaveGrafico;
import Grafico.Panel;
import Grafico.Ventana;
import Logica2.Coordenada;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class main {
    public static void main(String[] args){
        
        /**
            * arreglo se mete al panel y se muestra en la ventana
            */
           Ventana nuestraventana = new Ventana("juego");
           
            /**
           * se crea lista y dimenciones que tendra el juego
           */
           ArrayList ArregloDeobjetos = new ArrayList();
           
         
          //coordenadas derectangulo ensayo
          Coordenada cor1 = new Coordenada(250,250);
          // coordenada circulo
           Coordenada cor2 = new Coordenada(350,350);
          //nave
        Coordenada cor3 = new Coordenada(475,500);//punta
        Coordenada cor4 = new Coordenada(425,575);//izquierda
        Coordenada cor5 = new Coordenada(525,575);//derecha
        
        NaveGrafico nave = new NaveGrafico(cor3,cor4,cor5,Color.YELLOW);
        
        ArregloDeobjetos.add(nave);
        
          
            Panel nuestroPanel = new Panel(ArregloDeobjetos);
            nuestroPanel.refNave(nave);
                nuestraventana.add(nuestroPanel);
                nuestraventana.setSize(800,600);
                nuestraventana.setBackground(Color.darkGray);
                nuestraventana.setVisible(true);
      
    }
}
