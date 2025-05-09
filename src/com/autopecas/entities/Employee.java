package com.autopecas.entities;

public class Employee extends Person{
    private double salary;

    public Employee(String name, String adress, long cpf){
        super(name, adress, cpf);
    }

    public void show(){
        super.show();
        System.out.println(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
