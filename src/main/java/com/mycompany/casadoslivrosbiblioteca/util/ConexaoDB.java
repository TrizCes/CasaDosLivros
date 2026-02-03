package com.mycompany.casadoslivrosbiblioteca.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private static final String URL = "jdbc:derby://localhost:1527/biblioteca_db;";
    private static final String USER = "app";
    private static final String PASS = "app";

    public static Connection getConexao() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar com o banco: " + e.getMessage());
            return null;
        }
    }
}