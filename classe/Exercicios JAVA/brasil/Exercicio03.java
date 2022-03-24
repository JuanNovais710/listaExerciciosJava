package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soma de dois números");
        System.out.print("Informe o primeiro número que deseja somar: ");
        int numero1 = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        int numero2 = scanner.nextInt();
        int resultadoSoma = numero1 + numero2;
        System.out.println("O resultado da soma é: " + resultadoSoma);
        scanner.close();
    }
}