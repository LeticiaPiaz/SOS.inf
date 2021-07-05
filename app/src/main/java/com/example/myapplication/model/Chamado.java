package com.example.myapplication.model;

public class Chamado {
    String id;
    String assunto;
    String descricao;
    String status;
    Boolean prioridade;
    String solicitante;
    String responsavel;


    public Chamado(){

    }

    public Chamado(String id, String assunto, String descricao, Boolean prioridade, String status,String solicitante,String responsavel) {
        this.id = id;
        this.assunto = assunto;
        this.descricao = descricao;
        this.status = status;
        this.prioridade = prioridade;
        this.solicitante = solicitante;
        this.responsavel = responsavel;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Boolean getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(Boolean prioridade) {
        this.prioridade = prioridade;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
