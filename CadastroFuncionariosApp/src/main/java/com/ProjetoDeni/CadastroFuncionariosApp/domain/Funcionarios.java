package com.ProjetoDeni.CadastroFuncionariosApp.domain;

public class Funcionarios {

    private String nome;

    public Funcionarios(String nome)
    {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
