package com.company;

public class ApoliceTeste {

    public static void main(String[] args) {
	// write your code here
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("João Silva");
        apolice.setIdade(25);
        apolice.setValorPremio(2399.66f);
        apolice.imprimir();
    }
}
