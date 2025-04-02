package com.example.uatizapinatoracme.modelos;

public class Contato {
    private int contatoId;
    private String contato;
    private String celular;
    private String email;

    public Contato(String contato, String celular, String email) {
        this.contatoId = contatoId;
        this.contato = contato;
        this.celular = celular;
        this.email = email;
    }

    public int getContatoId() {
        return contatoId;
    }

    public void setContatoId(int contatoId) {
        this.contatoId = contatoId;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
