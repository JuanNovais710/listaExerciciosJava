package exercicios.python.brasil.estruturas_de_decisao.exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número real qualquer: ");
        double numeroInformado = scanner.nextDouble();
        boolean numeroInteiro = numeroInformado % 1 == 0;

        if(numeroInteiro)
            System.out.printf("O número %.2f. é inteiro.", numeroInformado);
        else {
            System.out.printf("O número %.2f. é decimal.", numeroInformado);
        }
    }
}
