/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;
import Logica2.Coordenada;
import Logica2.Dibujable;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author JUAN DAVID
 */
public class Panel extends JPanel implements KeyListener{
        ArrayList v;
        NaveGrafico nave ;
        Coordenada movimientoIzq = new Coordenada(-25,0);//ejes X y ejes Y
    Coordenada movimientoDer = new Coordenada(25,0);
    Coordenada movimientoNulo = new Coordenada(0,0);// al soltar la tecla 
    
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
     
        this.addKeyListener(this);//escuchador
        setFocusable(true);//espera constante mente las entradas 
    }
    /**
     * metodo recibe como parametro un grafico 
     */
public void paint(Graphics g){
        Dimension d = getSize();
        Image Imagen = createImage(d.height,d.width);
        Graphics buff = Imagen.getGraphics();
        Dibujable dib;
        for (int i=0;i<v.size();i++){
            dib =(Dibujable)v.get(i);
            //pinta y la repinta para evitar el bug
            dib.dibujar(buff);
            g.drawImage(Imagen, 0, 0, null);
        }
    }
/**
 * llama al metodo paint
 * @param g 
 */
public void update(Graphics g){
    paint(g);
}
     @Override
    public void keyTyped(KeyEvent ke) {
    }
/**
 * metodo que mueve el poligino a coordenadas 
 * @param e 
 */
    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();
        if(tecla == KeyEvent.VK_LEFT){//DETECTA LA FLECHA IZQUIERDA 
           
            
            this.nave.mover(movimientoIzq);
           
                   
        }
         if(tecla == KeyEvent.VK_RIGHT ){//DECTECTA LA FLECHA DERECHA
           
            this.nave.mover(movimientoDer);
            
        }
          if(tecla == KeyEvent.VK_Q ){//Dispara
           
         CirculoGrafico bala = nave.Bala1();
          nave.balas.add(bala);
          v.add(bala);
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
         int tecla = e.getKeyCode();
        if(tecla == KeyEvent.VK_LEFT){//DETECTA LA FLECHA IZQUIERDA 
           
            this.nave.mover(movimientoNulo);
                   
        }
         if(tecla == KeyEvent.VK_RIGHT ){//DECTECTA LA FLECHA DERECHA
            this.nave.mover(movimientoNulo);
        }
         if(tecla == KeyEvent.VK_Q){//DECTECTA LA FLECHA DERECHA
           
        }
    }
     public void refNave(NaveGrafico n){
        this.nave=n;
    }
     public void run(){
        while(true){
            
          try{
                if(!nave.balas.isEmpty()){
                    nave.Ciclo();
                    
                }
              
              
              
                Thread.sleep(50);// se duerme cada 50 ml segundos
            }catch(InterruptedException err){System.out.println(err);}
            repaint();
            
            
        }
    }
}
