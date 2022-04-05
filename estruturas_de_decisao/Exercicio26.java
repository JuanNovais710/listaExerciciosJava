package com.company;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Álcool: R$ 1,90\tGasolina: R$ 2,50");
        System.out.print("Olá! Abastecer com álcool(A) ou gasolina?(G) ");
        String combustivelDesejado = scanner.nextLine();
        System.out.printf("Quantos litros de %s deseja abastecer? ", combustivelDesejado);
        int litrosDeCombustivel = scanner.nextInt();
        boolean desejaAlcool = combustivelDesejado.equals("A") || combustivelDesejado.equals("a");
        boolean desejaGasolina = combustivelDesejado.equals("G") || combustivelDesejado.equals("g");
        double valorLitroAlcool = 1.90;
        double valorLitroGasolina = 2.50;
        double valorParcialAlcool = valorLitroAlcool * litrosDeCombustivel;
        double valorParcialGasolina = valorLitroGasolina * litrosDeCombustivel;
        if (desejaAlcool) {
            if (litrosDeCombustivel <= 20) {
                double descontoAte20L = ((valorLitroAlcool * litrosDeCombustivel) * 3) / 100;
                double valorAPagar = valorParcialAlcool - descontoAte20L;
                System.out.println("Comprando " + litrosDeCombustivel + "L de álcool, fornecemos 3% de desconto.");
                System.out.printf("Seu pedido custa: R$ %.2f", valorAPagar);
            }else {
                double descontoMaisQue20L = (valorParcialAlcool * 5) / 100;
                double valorAPagar = valorParcialAlcool - descontoMaisQue20L;
                System.out.println("Comprando " + litrosDeCombustivel + " litros de álcool, fornecemos desconto de 5%!!");
                System.out.printf("Seu pedido custa: R$ %.2f", valorAPagar);
            }
        }else if(desejaGasolina) {
            if(litrosDeCombustivel <= 20) {
                double descontoAte20L = ((valorLitroGasolina * litrosDeCombustivel) * 4);
                double valorApagar = valorParcialGasolina - descontoAte20L;
                System.out.println("Comprando " + litrosDeCombustivel + "L de gasolina, fornecemos 4% de desconto.");
                System.out.printf("Seu pedido custa: R$ %.2f", valorApagar);
            }else {
                double descontoMaisQue20L = (valorParcialGasolina * 6) / 100;
                double valorAPagar = valorParcialGasolina - descontoMaisQue20L;
                System.out.println("Comprando " + litrosDeCombustivel + "L de gasolina, fornecemos 6% de desconto!!");
                System.out.printf("Seu pedido custa: R$ %.2f", valorAPagar);
            }
        }
    }
}
