package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno: ");
        double primeiraNota = scanner.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        double segundaNota = scanner.nextDouble();
        System.out.print("Digite a terceira nota do aluno: ");
        double terceiraNota = scanner.nextDouble();
        System.out.print("Digite a quarta nota do aluno: ");
        double quartaNota = scanner.nextDouble();
        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        System.out.println("A média do aluno foi: " + media);
    }
}
