package com.company;

public class Main {

    public static void main(String[] args) {
	    Aluno aluno1, aluno2;
        aluno1 = new Aluno();
        aluno1.ra = 37;
        aluno1.nome = "Paulo";
        aluno1.curso = "ADS";

        aluno1.matricular();
        aluno1.cancelarMatricula();
    }
}
