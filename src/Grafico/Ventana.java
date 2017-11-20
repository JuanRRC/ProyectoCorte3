/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author JUAN DAVID
 */
/**
 * 
 * se implementa el WindowListener para poder cerrar la ventana
 */
public class Ventana extends JFrame implements WindowListener{
    /**
     * llama al constructor padre y se fijahasta recibir un string
     * @param title 
     */
      public Ventana (String title){
        super(title);
        setSize(800,600);
        addWindowListener(this);
    }

     @Override
    public void windowOpened(WindowEvent we) {
    }

    @Override
    public void windowClosing(WindowEvent we)  { System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
    }

    @Override
    public void windowIconified(WindowEvent we) {
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
    }

    @Override
    public void windowActivated(WindowEvent we) {
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    }
    
}
