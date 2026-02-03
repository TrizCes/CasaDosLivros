/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.casadoslivrosbiblioteca;

import com.mycompany.casadoslivrosbiblioteca.util.ConexaoDB;
import java.sql.SQLException;

/**
 *
 * @author oglia
 */
public class CasaDosLivrosBiblioteca {

    public static void main(String[] args) {
    var conn = ConexaoDB.getConexao();
    if (conn != null) {
        System.out.println("Conexão estabelecida com sucesso!");
        try { conn.close(); } catch (SQLException e) {}
    } else {
        System.out.println("Falha na conexão.");
    }
}
}
