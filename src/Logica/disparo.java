
package Logica;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import juego.Principal;

/**
 * metodo disparo que contiene el hilo que hace posible la visualizacion del disparo realizado por el cubo.
 * @author Juan David Reyes
 * @author Juan Ricardo Rodriguez Campos
 */
public class disparo extends Thread{
    
    int i=0;
    JLabel cubo,dis;
    int x,y;
    Principal principal;
    /**
     * Metodo constructor de la clase disparo.
     * @param cubo
     * @param dis 
     */
    public disparo(JLabel cubo,JLabel dis){
        this.cubo=cubo;
        this.dis=dis;
        this.x=x;
        this.y=y;
        
    }
    
    /**
     * metodo datos para conocer las coordenadas del disparo realizado para futuras validaciones de juego.
     */
    public void datos(){
        
        System.out.println(x);
        System.out.println(y);

        
    }
    
    /**
     * metodo run() que contiene la logica del hilo ejecutado...... en este caso la trayectoria recorrido por el disparo
     */
    @Override
    public void run(){
        
        int n;
        int p=0;
        int x = cubo.getX();
            try {
                for(i=400;i>1;i--){
                    dis.setLocation(x,i);
                    sleep(5);
                }
                System.out.println("posicion disparo en Y "+dis.getY());
                System.out.println("posicion disparo en X "+dis.getX());
                
            } catch (InterruptedException ex) {
                Logger.getLogger(posicion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
    
    public void reset(){
        this.i=0;
    }
    
    
}
