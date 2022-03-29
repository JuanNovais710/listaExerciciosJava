package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double raioCirculo = scanner.nextDouble();
        double pi = 3.14;
        double areaCirculo = pi * (raioCirculo * raioCirculo);
        System.out.printf("A área do círculo calculada com o raio fornecido é: %.2f", areaCirculo);




    }
}
