package com.company;

public class ComputadorTeste {

    public static void main(String[] args) {
	    Computador computador1 = new Computador();
        computador1.numeroSerie = 234;
        computador1.modelo = "Insp";
        computador1.marca = "HP";
        computador1.preco = 5000;
        computador1.cor = "Branca";
        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();

        Computador computador2 = new Computador();
        computador2.numeroSerie = 345;
        computador2.modelo = "Novo";
        computador2.marca = "IBM";
        computador2.preco = 10000;
        computador2.cor = "Preta";
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();

        if(computador2.alterarValor(8000)==1){
            System.out.println("Preço alterado com sucesso");
        }else{
            System.out.println("Valor incorreto para alterar");
        }

        computador2.imprimir();

    }
}
