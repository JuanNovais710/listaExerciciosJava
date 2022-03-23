package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a temperatura em ºF? ");
        double temperaturaF = scanner.nextDouble();
        double temperaturaCelsius = ((temperaturaF-32) / 1.8);
        System.out.println("A temperatura em ºC é: " + temperaturaCelsius);
    }
}
