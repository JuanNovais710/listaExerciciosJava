package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        System.out.print("Por fim, digite um número real qualquer: ");
        double numeroReal = scanner.nextDouble();

        int primeiraConta = (numero1 * 2) + (numero2 / 2);
        double segundaConta = (numero1 * 3) + numeroReal;
        double terceiraConta = Math.pow(numeroReal, 3);

        System.out.println("(" + numero1 + "*" + numero1 + ")" + " + (" + numero2 + "/2) = " + primeiraConta);
        System.out.println("(" + numero1 + "*3)" + " + " + numeroReal + " = " + segundaConta);
        System.out.println(numeroReal + "^3 = " + terceiraConta);
    }
}