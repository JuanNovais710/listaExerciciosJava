package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a temperatura em ºC? ");
        double temperaturaCelsius = scanner.nextDouble();
        double temperaturaF = (1.8 * temperaturaCelsius) + 32;
        System.out.println("A temperatura em ºF é: " + temperaturaF);
    }
}