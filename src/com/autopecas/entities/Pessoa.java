package com.autopecas.entities;

public class Pessoa {

    private String nome;
    private String endereco;
    private long cpf;

    public Pessoa(){

    }

    public Pessoa(String nome, String endereco, long cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.endereco);
        System.out.println(this.cpf);
    }

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

    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    public long getCpf(){
        return cpf;
    }
}
