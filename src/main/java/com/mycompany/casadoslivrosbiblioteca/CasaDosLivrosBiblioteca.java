package com.mycompany.casadoslivrosbiblioteca;

import com.mycompany.casadoslivrosbiblioteca.dao.LivroDAO;
import com.mycompany.casadoslivrosbiblioteca.model.Livro;
import java.util.List;

public class CasaDosLivrosBiblioteca {

    public static void main(String[] args) {
        LivroDAO dao = new LivroDAO();

        System.out.println("\n--- ACERVO DA BIBLIOTECA ---");
        List<Livro> acervo = dao.listarTodos();

        for (Livro l : acervo) {
            // Isso usa o método toString() que criamos na classe Livro
            System.out.println(l);
        }
    }
}
