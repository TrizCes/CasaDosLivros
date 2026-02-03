package com.mycompany.casadoslivrosbiblioteca.dao;

import com.mycompany.casadoslivrosbiblioteca.model.Usuario;
import com.mycompany.casadoslivrosbiblioteca.util.ConexaoDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public List<Usuario> listarTodos() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM USUARIOS";

        try (Connection conn = ConexaoDB.getConexao(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("ID_USUARIO"));
                u.setNome(rs.getString("NOME"));
                u.setMatricula(rs.getString("MATRICULA"));
                usuarios.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}
