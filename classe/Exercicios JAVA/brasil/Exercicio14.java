package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Olá João, quantos KG de peixe você pescou hoje? ");
        double quantidadePescada = scanner.nextDouble();
        boolean pagaMulta = quantidadePescada > 50;
        double pesoExcedente = quantidadePescada - 50;
        double multa = pesoExcedente * 4;

        if (!pagaMulta) {
            System.out.println("João você está sob o regulamento, com menos de 50Kg. Ok.");
        } else {
            System.out.println("João, você pescou mais que o regulamento permite. Deverá pagar uma multa de: R$" + multa);
        }
    }
}