package com.mycompany.casadoslivrosbiblioteca.model;

public class Usuario {

    private int id;
    private String nome;
    private String matricula;

    // Construtor padrão
    public Usuario() {
    }

    // Construtor completo
    public Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", matricula=" + matricula + '}';
    }
}
