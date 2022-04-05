package exercicios.python.brasil.estruturas_de_decisao.exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Informe o segundo número: ");
        double segundoNumero = scanner.nextDouble();
        boolean resultadoMaior = primeiroNumero > segundoNumero;

        if (!resultadoMaior) {
            System.out.print("O maior número informado é: " + segundoNumero);
        } else {
            System.out.print("O maior número informado é: " + primeiroNumero);
        }scanner.close();
    }
}
