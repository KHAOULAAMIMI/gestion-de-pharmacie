package com.example.gestfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnexionDB {
    static String user = "root";
    static String password = "ABCabc12455@#?$";
    static String url = "jdbc:mysql://localhost/gestionPharma";
    static String driver = "com.mysql.cj.jdbc.Driver";
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName(driver);
            try {
                con = DriverManager.getConnection(url,user,password);
                System.out.println("connexion ok");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } return con;
    }
}