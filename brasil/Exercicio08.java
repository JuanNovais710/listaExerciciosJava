package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cálculo salário");
        System.out.print("Quantos reais você ganha por hora trabalhada? ");
        double valorHora = scanner.nextDouble();
        System.out.print("E o total de horas trabalhadas esse mês? ");
        double totalHoras = scanner.nextDouble();
        double totalSalario = valorHora * totalHoras;
        System.out.println("O total que você receberá esse mês é: R$ " + totalSalario);
    }
}
