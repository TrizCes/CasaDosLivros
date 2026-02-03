package com.mycompany.casadoslivrosbiblioteca.model;

public class Genero {

    private int id;
    private String nome;

    // Construtor padrão
    public Genero() {
    }

    // Construtor para criar novos géneros sem precisar do ID manual
    public Genero(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Genero{" + "id=" + id + ", nome=" + nome + '}';
    }
}
