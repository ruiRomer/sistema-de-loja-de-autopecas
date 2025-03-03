package com.autopecas.entities;

public class Produto {

    private String nome;
    private int quantidade;
    private double preco;
    private String garantia;

    public Produto(){

    }

    public Produto(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public Produto(String nome, int quantidade, double preco, String garantia){
        this(nome, quantidade, preco);
        this.garantia = garantia;
    }


    public void imprime(){
        System.out.println("Nome do produto: " +this.nome);
        System.out.println("Quantidade: " +this.quantidade);
        System.out.println("Preço: R$" +this.preco);
    }

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
