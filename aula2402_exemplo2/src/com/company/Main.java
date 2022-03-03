package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();
	    Aluno aluno1, aluno2;
        aluno1 = new Aluno();
        cadastrar(aluno1);

        aluno2 =new Aluno();
        cadastrar(aluno2);

        lista.add(aluno1);
        lista.add(aluno2);

        for(Aluno aluno : lista){
            System.out.println("Nome: " + aluno.nome);
        }
    }

    private static void cadastrar(Aluno aluno) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ra: ");
        aluno.ra = Integer.parseInt(input.nextLine());
        System.out.println("Digite o nome: ");
        aluno.nome = input.nextLine();
        System.out.println("Digite o curso: ");
        aluno.curso = input.nextLine();
    }
}
