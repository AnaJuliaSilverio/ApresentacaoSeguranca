package org.example;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String senha;


    public Cliente(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
