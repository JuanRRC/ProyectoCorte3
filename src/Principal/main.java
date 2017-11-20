/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Grafico.Panel;
import Grafico.Ventana;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author JUAN DAVID
 */
public class main {
    public static void main(String[] args){
           Ventana nuestraventana = new Ventana("juego");
           ArrayList ArregloDeobjetos = new ArrayList();
           
          /**
           * se crea lista y dimenciones que tendra el juego
           */
            Panel nuestroPanel = new Panel(ArregloDeobjetos);
                nuestraventana.add(nuestroPanel);
                nuestraventana.setSize(800,600);
                nuestraventana.setBackground(Color.darkGray);
                nuestraventana.setVisible(true);
      
    }
}
