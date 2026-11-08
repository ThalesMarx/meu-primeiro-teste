package com.example.testesautoiaula1;

//Código 1: Classe de Negócio
public class CalculadoraDesconto {

    public double aplicarDesconto(double valorTotal){
        if(valorTotal <= 0){
            throw new IllegalArgumentException("O valor total deve ser maior que zero.");
        }
        if(valorTotal >= 100.00){
            return valorTotal * 0.90; //10% de desconto
        }
        return valorTotal;
    }
}
