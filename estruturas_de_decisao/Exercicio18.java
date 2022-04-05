package exercicios.python.brasil.estruturas_de_decisao.exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Validador de data formato:\t01/01/0001\nInforme um dia do mês: \tEx: 31 ");
        int diaInformado = scanner.nextInt();
        System.out.print("Um mês do ano: ");
        int mesInformado = scanner.nextInt();
        System.out.print("E um ano: ");
        int anoInformado = scanner.nextInt();
        boolean dataValida = diaInformado > 1 && diaInformado <= 31 && mesInformado > 01 && mesInformado <= 12 && anoInformado > 0001 && anoInformado <= 10000;

        if(dataValida)
            System.out.printf("A data %d/%d/%d é válida.", diaInformado, mesInformado, anoInformado);
        else
            System.out.println("Data inválida.");

    }
}
