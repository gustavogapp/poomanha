package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        String nome;
        System.out.println("Digite o nome: ");
        nome = input.nextLine();
        System.out.println("Digite o salário: ");
        salario = Double.parseDouble(input.nextLine());
        System.out.println("Nome digitado: " + nome);
        System.out.printf("Nome digitado:  %s \n", nome);
        System.out.println("Salário: " + salario);
    }
}
