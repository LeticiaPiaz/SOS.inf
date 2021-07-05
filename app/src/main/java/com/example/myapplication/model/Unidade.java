package com.example.myapplication.model;

import androidx.annotation.VisibleForTesting;

public class Unidade {
    String id;
    String nome;
    String endereco;
    String cep;

    public Unidade(){
    }

    public Unidade(String id,String nome,String endereco,String cep){
        this.id = id;
        nome = this.nome;
        endereco = this.endereco;
        cep = this.cep;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    }
