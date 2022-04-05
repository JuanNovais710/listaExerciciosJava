package exercicios.python.brasil.estruturas_de_decisao.exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio19_terminar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número aleatório, menor que 1000: ");
        int numeroInformado = scanner.nextInt();
        int acharUnidade = numeroInformado % 10;

        if(numeroInformado > 1000)
            System.out.println("Número inválido.");
        System.out.println(acharUnidade);
    }

}
