package exercicios.python.brasil.estruturas_de_decisao.exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        int segundoNumero = scanner.nextInt();
        System.out.print("Selecione o tipo de operação que deseja realizar:\n(1): +\t(3): *\n(2): -\t(4): /\n");
        int operacaoMatematica = scanner.nextInt();
    }
}
