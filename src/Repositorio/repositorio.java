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
import java.util.ArrayList;

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
    
       public static ArrayList<Jugadores> obtenerTodos() {
        ArrayList<Jugadores> juga = new ArrayList<Jugadores>();

        try {
            String query = "SELECT * FROM jugadores;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                juga.add(Jugadores.crear(resultado.getInt("contraseña"),resultado.getString("nick")));
            }

            sentenciaP.close();
            database.close();

            return juga;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return juga;
    } 
    
       public static ArrayList<Usuarios> obtenerTodos2() {
        ArrayList<Usuarios> juga = new ArrayList<Usuarios>();

        try {
            String query = "SELECT * FROM registros WHERE edad between 5 and 15;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
  //String nombre, String apellido, int edad, String cedula,String fecha,String fechaR,String foto
                juga.add(Usuarios.crear(resultado.getString("nombre"),resultado.getString("apellido"),resultado.getInt("edad"),resultado.getString("cedula"),resultado.getString("fecha_N"),resultado.getString("fecha"),resultado.getString("foto")));
            }

            sentenciaP.close();
            database.close();

            return juga;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return juga;
    } 
    
    public static ArrayList<Usuarios> obtenerTodos3() {
        ArrayList<Usuarios> juga = new ArrayList<Usuarios>();

        try {
            String query = "SELECT * FROM registros WHERE edad between 16 and 24;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
  //String nombre, String apellido, int edad, String cedula,String fecha,String fechaR,String foto
                juga.add(Usuarios.crear(resultado.getString("nombre"),resultado.getString("apellido"),resultado.getInt("edad"),resultado.getString("cedula"),resultado.getString("fecha_N"),resultado.getString("fecha"),resultado.getString("foto")));
            }

            sentenciaP.close();
            database.close();

            return juga;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return juga;
    } 
    
    
    public static ArrayList<Usuarios> obtenerTodos4() {
        ArrayList<Usuarios> juga = new ArrayList<Usuarios>();

        try {
            String query = "SELECT * FROM registros WHERE edad between 25 and 50;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
  //String nombre, String apellido, int edad, String cedula,String fecha,String fechaR,String foto
                juga.add(Usuarios.crear(resultado.getString("nombre"),resultado.getString("apellido"),resultado.getInt("edad"),resultado.getString("cedula"),resultado.getString("fecha_N"),resultado.getString("fecha"),resultado.getString("foto")));
            }

            sentenciaP.close();
            database.close();

            return juga;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return juga;
    } 
    
}