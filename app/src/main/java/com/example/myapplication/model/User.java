package com.example.myapplication.model;

public class User {
    String id;
    String nome;
    String login;
    String fone;
    String email;
    String senha;
    String tipo_conta;
    String unidade;
    String setor;

    public User() {
    }

    public User(String id, String nome, String login, String fone, String email, String senha,String tipo_conta,String unidade,String setor) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.fone = fone;
        this.email = email;
        this.senha = senha;
        this.tipo_conta = tipo_conta;
        this.unidade = unidade;
        this.setor = setor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
            return  login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
