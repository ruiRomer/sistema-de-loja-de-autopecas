package com.autopecas.entities;

public class Produto {

    private String nome;
    private int quantidade;
    private double preco;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getPreco(){
        return preco;
    }

    public double valorTotalEmEstoque(){
        return quantidade * preco;
    }

    public double desconto(double porcentagem){
        return porcentagem * this.preco;
    }
}
