package exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para cada dia da semana:\n(1): Domingo\t    (3): Terça-feira\n(2): Segunda-feira\t(5): Quinta-feira\n(4): Quarta-feira\t(7): Sábado\n(6): Sexta-feira\n");
        int numeroInformado = scanner.nextInt();
        String dia = switch (numeroInformado) {
            case 1 -> "Domingo!";
            case 2 -> "Segunda-feira.";
            case 3 -> "Terça-feira.";
            case 4 -> "Quarta-feira.";
            case 5 -> "Quinta-feira.";
            case 6 -> "Sexta-feira!";
            case 7 -> "Sábado!";
            default -> "Valor inválido.";
        };

        System.out.println("Dia da semana: " + dia);
    }
}
