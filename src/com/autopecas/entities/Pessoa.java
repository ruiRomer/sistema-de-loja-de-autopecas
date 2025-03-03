package com.autopecas.entities;

public class Pessoa {

    private String nome;
    private String endereco;
    private int cpf;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome (){
        return nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public int getCpf(){
        return cpf;
    }
}
