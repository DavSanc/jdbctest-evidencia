package com.mycompany.jdbctest;


import java.sql.Connection; // se importa clase llamada .Conection
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jdbctest {
    public static void main(String[] args) {
        String usuario="root"; //Crea variable usuario y contiene dentro, texto root
        String password=""; // Variable vacia
        String url="jdbc:mysql://localhost:3306/Jdbctest"; //Url de la base de datos
        Connection conexion; //Crear constante para almacenar conexion
        Statement statement;
        ResultSet rs;
        
        try {
            conexion = DriverManager.getConnection(url, usuario, password); 
            statement = conexion.createStatement();
            rs = statement.executeQuery("SELECT * FROM usuarios");
            while(rs.next()) {
                System.out.println(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Jdbctest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
