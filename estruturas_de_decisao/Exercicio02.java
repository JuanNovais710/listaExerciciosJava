package exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numeroInformado = scanner.nextDouble();
        boolean numeroPositivo = numeroInformado > 0;

        if (!numeroPositivo) {
            System.out.print("O número informado " + numeroInformado + " é negativo");
        } else {
            System.out.print("O número informado: " + numeroInformado + " é positivo");
        }scanner.close();
    }
}
