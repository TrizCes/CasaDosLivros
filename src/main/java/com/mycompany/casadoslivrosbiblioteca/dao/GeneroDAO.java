package com.mycompany.casadoslivrosbiblioteca.dao;

import com.mycompany.casadoslivrosbiblioteca.model.Genero;
import com.mycompany.casadoslivrosbiblioteca.util.ConexaoDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GeneroDAO {

    // Método para salvar um novo género
    public void salvar(Genero genero) {
        String sql = "INSERT INTO GENEROS (NOME) VALUES (?)";

        try (Connection conn = ConexaoDB.getConexao(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, genero.getNome());
            stmt.executeUpdate();
            System.out.println("Género '" + genero.getNome() + "' guardado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao guardar género: " + e.getMessage());
        }
    }

    // Método para listar todos os géneros cadastrados
    public List<Genero> listarTodos() {
        List<Genero> generos = new ArrayList<>();
        String sql = "SELECT * FROM GENEROS";

        try (Connection conn = ConexaoDB.getConexao(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Genero g = new Genero();
                g.setId(rs.getInt("ID_GENERO"));
                g.setNome(rs.getString("NOME"));
                generos.add(g);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar géneros: " + e.getMessage());
        }
        return generos;
    }
}
