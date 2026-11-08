package com.example.testesautoiaula1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Código 2: Classe de Teste Unitário Automatizado com JUnit 5
public class CalculadoraDescontoTest {

    @Test
    @DisplayName("Deve aplicar 10% de desconto para valores maiores ou iguais a cem.")
    void deveAplicarDescontoParaValoresMaioresOuIguaisACem(){
        //1. Arrange (Preparação)
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        double valorEntrada = 100.00;
        double valorEsperado = 90.00;

        //2. Act (Ação)
        double valorComDesconto = calculadoraDesconto.aplicarDesconto(valorEntrada);

        //3. Assert (Verificação)
        assertEquals(valorEsperado, valorComDesconto, "O valor com desconto deveria ser R$90,00");
    }

    @Test
    @DisplayName("Não deve aplicar desconto para valores menores que cem.")
    void naoDeveAplicarDescontoParaValoresMenoresQueCem(){
        //1. Arrange (Preparação)
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        double valorEntrada = 50.00;
        double valorEsperado = 50.00;

        //2. Act (Ação)
        double valorCalculado = calculadoraDesconto.aplicarDesconto(valorEntrada);

        //3. Assert (Verificação)
        assertEquals(valorEsperado, valorCalculado);
    }
}
