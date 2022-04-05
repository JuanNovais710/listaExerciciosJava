package exercicios.python.brasil.estruturas_de_decisao.exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro qualquer: ");
        int numeroInformado = scanner.nextInt();
        boolean numeroPar = numeroInformado % 2 == 0;

        if(numeroPar) {
            System.out.printf("O número %d é par.", numeroInformado);
        }else {
            System.out.printf("O número %d é ímpar.", numeroInformado);
        }
    }
}
