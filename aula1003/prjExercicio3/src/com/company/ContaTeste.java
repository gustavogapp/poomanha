package com.company;

import java.util.Scanner;

public class ContaTeste {

    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaTeste gerenciar = new ContaTeste();
        int opcao;
        do{
            //menu
            System.out.println("Menu Principal ");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Consultar");
            System.out.println("9.. Sair");
            System.out.println("Escolha sua opção: ");
            opcao = Integer.parseInt(input.nextLine());
            switch(opcao){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execDepositar();
                    break;
                case 3:
                    gerenciar.execSacar();
                    break;
                case 4:
                    gerenciar.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);

    }

    public void execCadastrar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a agencia: ");
        cc.agencia = input.nextLine();
        System.out.println("Digite o numero da conta: ");
        cc.conta = input.nextLine();
        System.out.println("Digite o nome do cliente: ");
        cc.nomeCliente = input.nextLine();
        System.out.println("Conta Cadastra com Sucesso");
    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(input.nextLine());
        if(cc.sacar(valor)==1) {
            System.out.println("saque efetuado com sucesso");
        }else{
            System.out.println("sem saldo suficiente");
        }
    }
    public void execDepositar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(input.nextLine());
        cc.depositar(valor);
        System.out.println("Depósito efetuado com sucesso");
    }
}
