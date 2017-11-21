
package Logica;

import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Logica.*;
import juego.*;

/**
 * Clase posicion que contiene los atributos y metodos que hacen posible visualizar el movimiento de las balas disparadas por el cañon
 * @author Juan David Reyes. 
 * @author Juan Ricardo Rodriguez Campos.
 */
public class posicion extends Thread{
    
    
    int i=0;
    JLabel enemigo,nave,dis;
    int x,y;
    JuegoN principal;
/**
 * Constructor de la clase posicion que recibe como parametros para poder visualizar el movimiento realizado por la bala de cañon
 * @param bala
 * @param x
 * @param y
 * @param cubo
 * @param dis 
 */    
    public posicion(JLabel enemigo,JLabel nave,JLabel dis){
        this.nave=nave;
        this.enemigo=enemigo;
        this.dis=dis;
        this.x=x;
        this.y=y;
        
    }
    /**
     * metodo datos para conocer las coordenadas del cubo
     */
    public void datos(){
        
        
        System.out.println("X :"+enemigo.getX());
        System.out.println("Y :"+enemigo.getY());
        
       
        
    }
    
    /**
     * metodo run que contiene la logica ejecutada por el hilo y realiza el movimiento de la bala disparada por el cañon
     */
    @Override
    public void run(){
        
        int n;
        int p=0;
       
            try {
                for(i=0;i<400;i++){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(400, enemigo.getY()+20);
                for(i=enemigo.getX();i>0;i--){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(0, enemigo.getY()+20);
                for(i=0;i<400;i++){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(400, enemigo.getY()+20);
                for(i=enemigo.getX();i>0;i--){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(0, enemigo.getY()+20);
                for(i=0;i<400;i++){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(400, enemigo.getY()+20);
                for(i=enemigo.getX();i>0;i--){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(0, enemigo.getY()+20);
                for(i=0;i<400;i++){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(400, enemigo.getY()+20);
                for(i=enemigo.getX();i>0;i--){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                
                enemigo.setLocation(0, enemigo.getY()+20);
                for(i=0;i<400;i++){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(400, enemigo.getY()+20);
                for(i=enemigo.getX();i>0;i--){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                
                enemigo.setLocation(0, enemigo.getY()+20);
                for(i=0;i<400;i++){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(400, enemigo.getY()+20);
                for(i=enemigo.getX();i>0;i--){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(0, enemigo.getY()+20);
                for(i=0;i<400;i++){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(400, enemigo.getY()+20);
                for(i=enemigo.getX();i>0;i--){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(0, enemigo.getY()+20);
                for(i=0;i<400;i++){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                enemigo.setLocation(400, enemigo.getY()+20);
                for(i=enemigo.getX();i>0;i--){
                    
                
                enemigo.setLocation(i,enemigo.getY());
                sleep(5);               
               
                }
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(posicion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
    /**
     * 
     */
    public void reset(){
        this.i=0;
    }
    
}
