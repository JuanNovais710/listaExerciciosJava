package exercicios.python.brasil.estruturas_de_decisao.exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma letra: ");
        String letraInformada = scanner.next();
        boolean vogais = letraInformada.equals("A") || letraInformada.equals("E") || letraInformada.equals("I") ||
                letraInformada.equals("O") || letraInformada.equals("U") || letraInformada.equals("a") || letraInformada.equals("e") ||
                letraInformada.equals("i") || letraInformada.equals("o") || letraInformada.equals("u");
        if (!vogais) {
            System.out.println("A letra: " + letraInformada + " é uma consoante");
        }else if (vogais) {
            System.out.println("A letra: " + letraInformada + " é uma vogal");
        }scanner.close();
    }
}
