package com.example.testesautoiaula1;

public class Teste {

    public static void main(String[] args) {
        CalculadoraDesconto calcDesc = new CalculadoraDesconto();
        System.out.println(calcDesc.aplicarDesconto(50));
        System.out.println(calcDesc.aplicarDesconto(120));
        System.out.println(calcDesc.aplicarDesconto(100));
    }
}
