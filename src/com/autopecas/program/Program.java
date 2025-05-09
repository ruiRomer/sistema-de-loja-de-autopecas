package com.autopecas.program;

import com.autopecas.entities.Products;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Products product = new Products();

        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();

        System.out.print("Quantidade do produto para o estoque: ");
        int quantity = sc.nextInt();

        System.out.print("Qual será o preço unitário do produto: ");
        double price = sc.nextDouble();

        product.setName(name);
        product.setQuantity(quantity);
        product.setPrice(price);

        System.out.println(product);

    }

}
