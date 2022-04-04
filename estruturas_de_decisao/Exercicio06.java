package exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Informe o segundo número: ");
        double segundoNumero = scanner.nextDouble();
        System.out.print("Informe o terceiro número: ");
        double terceiroNumero = scanner.nextDouble();

        if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println("O maior número é: " + primeiroNumero);
        }if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println("O maior número é: " + segundoNumero);
        }if(terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
            System.out.println("O maior número é: " + terceiroNumero);
        }scanner.close();
    }
}
