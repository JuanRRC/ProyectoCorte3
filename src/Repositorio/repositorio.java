/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import BaseDatos.*;
import Repositorio.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Clint
 */
public class repositorio {
    
    int cont =0;    
        private static BDManager database = new BDManager();

    public static void crear ( Usuarios usuario) {
        try {
            //INSERT INTO `registros`(`id_jugador`, `nombre`, `apellido`, `edad`, `cedula`, `fecha_N`, `fecha_R`, `foto`)
            String query = "INSERT INTO registros(nombre, apellido, edad,cedula,fecha_N,fecha,foto) VALUES ( ? ,? ,?, ?, ?,?,?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            
            
            sentenciaP.setString(1, usuario.getNombre());
            sentenciaP.setString(2, usuario.getApellido());
            sentenciaP.setInt(3,usuario.getEdad());
            sentenciaP.setString(4, usuario.getCedula());
            sentenciaP.setString(5, usuario.getFecha());
            sentenciaP.setString(6, usuario.getFechaR());
            sentenciaP.setString(7, usuario.getFoto());
          
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
    
}
        public static void crearJ ( Jugadores jugador) {
        try {
            //INSERT INTO `registros`(`id_jugador`, `nombre`, `apellido`, `edad`, `cedula`, `fecha_N`, `fecha_R`, `foto`)
            String query = "INSERT INTO Jugadores(nick,contraseña) VALUES ( ? ,? );";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            
            
            sentenciaP.setString(1, jugador.getNombreU());
            sentenciaP.setInt(2, jugador.getContraseña());
            
            
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
        }
    /**
     *
     * @param documento
     * @return
     */
    
        
    

    
    
    
}