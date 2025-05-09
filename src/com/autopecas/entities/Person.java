package com.autopecas.entities;

public class Person {

    private String name;
    private String adress;
    private long cpf;

    public Person(){

    }

    public Person(String name, String adress, long cpf){
        this.name = name;
        this.adress = adress;
        this.cpf = cpf;
    }

    public void show(){
        System.out.println(this.name);
        System.out.println(this.adress);
        System.out.println(this.cpf);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public String getAdress(){
        return adress;
    }

    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    public long getCpf(){
        return cpf;
    }
}
