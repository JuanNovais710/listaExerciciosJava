package exercicios.python.brasil.estruturas_de_decisao.exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um ano para que eu te diga se é bissexto, ou não: ");
        int anoInformado = scanner.nextInt();
        boolean anoBissexto = anoInformado % 4 == 0;

        if (anoBissexto)
            System.out.printf("O ano, %d é bissexto! ", anoInformado);
        else {
            System.out.printf("O ano, %d não é bissexto. ", anoInformado);
        }
    }
}
