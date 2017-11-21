/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;
import Logica2.Coordenada;
import Logica2.Dibujable;
import static Principal.main.Aleatorio;
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
    /**
     * CONTIENE EL POLIGONO v
     */
    ArrayList v;
    ArrayList ast = new ArrayList();
    NaveGrafico nave ;
    Coordenada movimientoIzq = new Coordenada(-25,0);//ejes X y ejes Y
    Coordenada movimientoDer = new Coordenada(25,0);
    Coordenada movimientoNulo = new Coordenada(0,0);// al soltar la tecla 
    
   int contadorAsteriodes =5;
   int score;
   int vidas =3;
   
    TextoGrafico Puntos;
     TextoGrafico Vidas;
      TextoGrafico final1;
    
/**
 * constructor de la clase panel
 * @param vectordeO 
 */
    public Panel(ArrayList vectordeO){
        this.v = vectordeO;
        this.addKeyListener(this);//escuchador
        setFocusable(true);//espera constante mente las entradas 
        
    }
    /**
     * metodo que nos permitira pintar y crear objetos a medida que dibuja mientras los elemtos 
     * no se acaben en el arreglo
     * @param g 
     */
    public void paint(Graphics g){
        Dimension d = getSize();
        Image Imagen = createImage(d.height,d.width);
        Graphics buff = Imagen.getGraphics();
        Dibujable dib;
        for (int i=0;i<v.size();i++){
            dib =(Dibujable)v.get(i);
            dib.dibujar(buff);
            g.drawImage(Imagen, 0, 0, null);
        }
    }
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
          if(tecla == KeyEvent.VK_SPACE ){//Dispara
           
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
    
    public void refAst(RectanguloGrafico a,RectanguloGrafico b,RectanguloGrafico c,RectanguloGrafico d,RectanguloGrafico e ){
       ast.add(a);
       ast.add(b);
        ast.add(c);
        ast.add(d);
       ast.add(e);
    }
    public void RefPuntos(TextoGrafico a){
        this.Puntos = a;
    }
    public void RefVida(TextoGrafico b){
        this.Vidas = b;
    }
    public void RefFinal(TextoGrafico c){
        this.final1 = c;
    }
    /**
     * este metodo controla el choque de las balas que suben y bajan
     */
   public void Colision1(){
        int i,j;
        for (i=0;i<nave.balas.size();i++){
           CirculoGrafico bala = (CirculoGrafico) nave.balas.get(i);  
        
       
        
        /**
         * este for se encarga de eliminar las balas cada vez que se chocan comparando 
         * los puntos de centro izquierda y derecha 
         */
      for(j=0;j<ast.size();j++){
            
            RectanguloGrafico aste =(RectanguloGrafico) ast.get(j);
            Coordenada Corbala = new Coordenada (bala.getX(),bala.getY());
            Coordenada Derecha = new Coordenada (aste.getX()+30,aste.getY());
            Coordenada Izquierda = new Coordenada (aste.getX()-15,aste.getY());
            Coordenada medio = new Coordenada(aste.getX(),aste.getY());
            
            if(Corbala.getX()>Izquierda.getX()&&Corbala.getX()<Derecha.getX()&&Corbala.getY()<medio.getY()
                    && Corbala.getY()+25>medio.getY()){
                aste.Pintar(Color.WHITE);
               bala.Pintar(Color.WHITE);
                bala.setY(-100);
                aste.setY(-100);
                nave.balas.remove(bala);
                ast.remove(aste);
                contadorAsteriodes --;
                score +=5;
                Puntos.SetColor(Color.DARK_GRAY);
                String NuevoScore = ""+score;
                 TextoGrafico NrPuntos = new TextoGrafico(NuevoScore ,Color.RED,150,305);
                NrPuntos.setSize(40);
                Puntos = NrPuntos;
                v.add(Puntos);
            }
            if ((medio.getY()> 475 && medio.getY()< 550)&&(nave.cor1.getX()< medio.getX())&&(nave.cor2.getX()>medio.getX())){
                score = score -5;
                vidas --;
                String NuevoScore=""+score;
                String NuevoaVida=""+vidas;
                Vidas.SetColor(Color.DARK_GRAY);
                Puntos.SetColor(Color.DARK_GRAY);
                TextoGrafico NrVidas = new TextoGrafico(NuevoaVida ,Color.RED,150,150);
                NrVidas.setSize(40);
                Vidas = NrVidas;
                 TextoGrafico NrPuntos = new TextoGrafico(NuevoScore ,Color.RED,150,305);
                NrPuntos.setSize(40);
                Puntos = NrPuntos;
                v.add(Vidas);
                v.add(Puntos);
                
                ast.remove(aste);
                aste.setY(2000);
               contadorAsteriodes--; 
            }
            
        }
        }
    }
    /**
     * metodo con el hilo de ejecucion
     */
    public void run(){
        while(true){
            
            try{
                if(!nave.balas.isEmpty()){
                    nave.Ciclo();
                    
                }
              int i;
              for(i=0;i<ast.size();i++){
                  RectanguloGrafico rect =  (RectanguloGrafico) ast.get(i);
                  rect.Ciclo();
                  if(rect.getY()>525){
                      int rango = Aleatorio(800,50);
                      rect.setY(0);
                      rect.setX(rango);
                  }
              }
              if(contadorAsteriodes <5){
                  int rango = Aleatorio(800,50);
                  Coordenada Inicio = new Coordenada(rango, 0);
                  RectanguloGrafico nuevo = new RectanguloGrafico(Inicio,25,25,Color.BLUE);
                  ast.add(nuevo);
                  v.add(nuevo);
                  nuevo.Ciclo();
                 contadorAsteriodes++; 
              }
               Colision1();
                Thread.sleep(50);// se duerme cada 50 ml segundos
            }catch(InterruptedException err){System.out.println(err);}
            repaint();
            
        }
    }
}
