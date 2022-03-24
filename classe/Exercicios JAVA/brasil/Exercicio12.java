package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double alturaPessoa = scanner.nextDouble();
        double pesoIdeal = 72.7 * alturaPessoa - 58.;
        System.out.println("Seu peso ideal seria: " + pesoIdeal);
    }
}
