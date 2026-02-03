package com.mycompany.casadoslivrosbiblioteca.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    // Caminho para o banco de dados (o Derby criará a pasta no seu projeto)
    private static final String URL = "jdbc:derby:biblioteca_db;create=true";
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