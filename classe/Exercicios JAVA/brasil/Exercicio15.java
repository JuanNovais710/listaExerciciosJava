package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cálculo salarial com débitos obrigatórios\n");
        System.out.print("Quanto você ganha por hora trabalhada? ");
        double valorHora = scanner.nextDouble();
        System.out.print("Quantas horas você trabalhou em determinado mês? ");
        double tempoTrabalhado = scanner.nextDouble();
        double salarioBruto = valorHora * tempoTrabalhado;

        double descontoImpostoRenda = (salarioBruto * 11) / 100;
        double descontoINSS = (salarioBruto * 8) / 100;
        double descontoSindicato = (salarioBruto * 5) / 100;
        double salarioLiquido = salarioBruto - descontoINSS - descontoSindicato - descontoImpostoRenda;

        System.out.print("Seu salário bruto foi: R$" + salarioBruto);
        System.out.print("\nVocê pagou:\n8% ao INSS: R$" + descontoINSS + ".\n");
        System.out.print("5% ao sindicato: R$" + descontoSindicato + ".\n");
        System.out.print("Seu salário líquido foi: R$" + salarioLiquido);

    }
}
