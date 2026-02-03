/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casadoslivrosbiblioteca.dao;

import com.mycompany.casadoslivrosbiblioteca.model.Livro;
import com.mycompany.casadoslivrosbiblioteca.util.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    public void salvar(Livro livro) {
        String sql = "INSERT INTO LIVROS (TITULO, AUTOR, ISBN, DISPONIVEL) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoDB.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Substituindo as "?" pelos valores reais do objeto livro
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getIsbn());
            stmt.setBoolean(4, livro.isDisponivel());

            stmt.executeUpdate();
            System.out.println("Livro '" + livro.getTitulo() + "' salvo com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao salvar livro: " + e.getMessage());
        }
    }

    public List<Livro> listarTodos() {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM LIVROS";

        try (Connection conn = ConexaoDB.getConexao(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Livro livro = new Livro();
                // Mapeando a coluna do banco para o atributo do objeto
                livro.setId(rs.getInt("ID_LIVRO"));
                livro.setTitulo(rs.getString("TITULO"));
                livro.setAutor(rs.getString("AUTOR"));
                livro.setIsbn(rs.getString("ISBN"));
                livro.setDisponivel(rs.getBoolean("DISPONIVEL"));

                livros.add(livro);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar livros: " + e.getMessage());
        }
        return livros;
    }
}
