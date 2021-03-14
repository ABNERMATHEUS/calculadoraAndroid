package com.abnerdev.calculadora;

public class Calculadora implements  ICalculadora{

    @Override
    public double soma(double valor1, double valor2) {
        return  valor1+valor2;
    }

    @Override
    public double substracao(double valor1, double valor2) {
        return valor1-valor2;
    }

    @Override
    public double mutiplicacao(double valor1, double valor2) {
        return valor1*valor2;
    }

    @Override
    public double divisao(double valor1, double valor2) {

        return valor1/valor2;
    }
}
