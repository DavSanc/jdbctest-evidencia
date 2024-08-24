package com.mycompany.jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jdbctest {
    public static void main(String[] args) {
        String usuario="root";
        String password="";
        String url="jdbc:mysql://localhost:3306/Jdbctest";
        Connection conexion;
        Statement statement;
        ResultSet rs;
        
        try {
            conexion = DriverManager.getConnection(url, usuario, password);
                    
                    } catch (SQLException ex) {
            Logger.getLogger(Jdbctest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
