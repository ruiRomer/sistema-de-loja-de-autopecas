package com.autopecas.entities;

public class Products {

    private String name;
    private int quantity;
    private double price;
    private String warranty;

    public Products(){

    }

    public Products(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    public Products(String name, int quantity, double price, String warranty){
        this(name, quantity, price);
        this.warranty = warranty;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public double totalValueInStock(){
        return quantity * price;
    }

    public double discount(double percentage){
        return percentage * this.price;
    }

    @Override
    public String toString(){
        return "Nome do produto: " +this.name+
        "\nQuantidade: " +this.quantity+
        "\nPreço: R$" +this.price+
        "\nValor em estoque: R$"+ totalValueInStock();
    }
}
