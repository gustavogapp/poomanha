package com.company;

public class Main {

    public static void main(String[] args) {
	    Conta conta1, conta2;
        conta1 = new Conta();
        conta2 = new Conta();
        //System.out.println("Cpmf da conta 1: " + conta1.cpmf);
        //conta1.cpmf = 0.004;
        //System.out.println("Cpmf da conta 2: " + conta2.cpmf);
        System.out.println("Cpmf de contas: " + Conta.cpmf);
    }
}
