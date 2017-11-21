/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space;

import Repositorio.Jugadores;
import Repositorio.repositorio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import juego.*;
import Principal.*;
import space.*;
import Grafico.*;
import Logica.*;
import juego.*;

/**
 * JPanel de login que valida que el usuario se encuentre registrado en la base de datos por medio de un usuario y contraseña
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 */
public class login extends javax.swing.JPanel {

    ArrayList<String> lista2 = new ArrayList<String>();
    
    /**
     * Creates new form login
     */
    Registro conec;
    public login() {
        initComponents();
    }
    
    public boolean datos(String nom,int con){
        ArrayList<Jugadores> lista1 = repositorio.obtenerTodos();
        Iterator<Jugadores> it = lista1.iterator();
        System.out.println(nom+""+con);
        Jugadores num;
        int i=0;
        while (i<lista1.size()){
            num = it.next();
            if((con==num.getContraseña())){
                
                System.out.println(num.getNombreU()+"----- "+ num.getContraseña());
                i=lista1.size();
                return true;    
            }
            i++;
        }
        
        return false;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JTextField();
        iniciar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jLabel1.setText("Usuraio:");

        jLabel2.setText("Contraseña:");

        iniciar.setText("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usuario)
                        .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(iniciar)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        
        
        if( 
            usuario.getText().isEmpty() || contraseña.getText().isEmpty()
        ){
            JOptionPane.showMessageDialog(this, "Por favor ingrese los datos en ambos campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
        // TODO add your handling code here:
        System.out.println("entre");
        System.out.println("ITERATOR");
        String nom=usuario.getText();
        String con=contraseña.getText();
        int contra= Integer.parseInt(con);
        
        if(datos(nom,contra)==false){
            System.out.println("Por favor intentelo de nuevo");
        }else{
            if(datos(nom,contra)==true){
                this.setVisible(false);
                //JuegoN p = new JuegoN();
                //p.setVisible(true);
                
                JuegoP N = new JuegoP();
                
               
            }
        }
        } 
    }//GEN-LAST:event_iniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contraseña;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
