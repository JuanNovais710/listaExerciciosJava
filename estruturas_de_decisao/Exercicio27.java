package com.company;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a quantidade desejada de morangos? em KG ");
        int quantidadeDeMorangos = scanner.nextInt();
        System.out.print("E a quantidade de maçãs? Em KG: ");
        int quantidadeDeMacas = scanner.nextInt();
        boolean comprarMorangos = quantidadeDeMorangos > 0;
        boolean comprarMacas = quantidadeDeMacas > 0;
        double precoMorangoOriginal = 2.5;
        double valorMorangosOriginal = quantidadeDeMorangos * precoMorangoOriginal;
        double precoMacasOriginal = 1.8;
        double valorMacasOriginal = quantidadeDeMacas * precoMacasOriginal;
        double valorParcial = valorMorangosOriginal + valorMacasOriginal;
        boolean descontoMorangos = quantidadeDeMorangos >= 5;
        boolean descontoMacas = quantidadeDeMacas >= 5;
        boolean comprarFrutasComDesconto = quantidadeDeMacas + quantidadeDeMorangos >= 8 || valorParcial > 25.00;

        if (comprarMorangos || comprarMacas)
            System.out.printf("Obrigado por comprar %d morangos e %d maçãs. O total deu: R$ %.2f", quantidadeDeMorangos, quantidadeDeMacas, valorParcial);

        if (descontoMacas || descontoMorangos) {
            double precoMorangoDescontado = 2.2;
            double valorMorangosDescontado = quantidadeDeMorangos * precoMorangoDescontado;
            double precoMacaDescontada = 1.5;
            double valorMacasDescontadas = quantidadeDeMacas * precoMacaDescontada;
            double valorTotal = valorMacasDescontadas + valorMorangosDescontado;
            System.out.printf("Por comprar %d maçãs e %d morangos, receberá desconto, totalizando R$: %.2f", quantidadeDeMacas, quantidadeDeMorangos, valorTotal);

            if (comprarFrutasComDesconto) {
                double descontoMais10 = (valorTotal * 10 / 100);
                double valorDescontadoComMaisDesconto = valorTotal - descontoMais10;
                System.out.print("Por estar comprando " + quantidadeDeMacas + " maçãs e " + quantidadeDeMorangos + " morangos ganhará ainda mais 10% de desconto, totalizando: " + valorDescontadoComMaisDesconto);
            }
        }
    }
}

