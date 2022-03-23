package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos metros deseja converter? ");
        int quantidadeMetros = scanner.nextInt();
        double quantidadeCm = quantidadeMetros * 100;
        System.out.println(quantidadeMetros + "M convertidos em centímetros são: " + quantidadeCm + " CM");

    }
}
