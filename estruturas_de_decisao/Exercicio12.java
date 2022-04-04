package exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor da sua hora trabalhada: ");
        double valorHora = scanner.nextDouble();
        System.out.print("E quantas horas você trabalhou neste mês? ");
        double totalHorasTrabalhadas = scanner.nextDouble();
        double salarioBruto = valorHora * totalHorasTrabalhadas;
        boolean salarioAte900 = salarioBruto <= 900.00;
        boolean salarioAte1500 = salarioBruto <= 1500.00;
        boolean salarioAte2500 = salarioBruto <= 2500.00;
        double descontoSindicato = (salarioBruto * 3 / 100);
        double valorFGTS = (salarioBruto * 11) / 100;

        if(salarioAte900) {
            double salarioLiquido = salarioBruto - descontoSindicato;
            double totalDescontos = descontoSindicato;
            System.out.printf("Salário bruto: R$ %.2f%nIR: Isento\nDesconto do Sindicato: R$ %.2f%nFGTS: R$ %.2f", salarioBruto, descontoSindicato, valorFGTS);
            System.out.printf("\nTotal de descontos: R$ %.2f\nSeu salário líquido será: R$ %.2f", totalDescontos, salarioLiquido);
        }else if(salarioAte1500) {
            double impostoDeRenda = (salarioBruto * 5) / 100;
            double salarioLiquido = salarioBruto - descontoSindicato - impostoDeRenda;
            double totalDescontos = impostoDeRenda + descontoSindicato;
            System.out.printf("Salário bruto: R$ %.2f%nIR: R$ %.2f\nDesconto do Sindicato: R$ %.2f%nFGTS: R$ %.2f", salarioBruto, impostoDeRenda, descontoSindicato, valorFGTS);
            System.out.printf("\nTotal de descontos: R$ %.2f\nSeu salário líquido será: R$ %.2f", totalDescontos, salarioLiquido);
        }else if(salarioAte2500) {
            double impostoDeRenda = (salarioBruto * 10) / 100;
            double salarioLiquido = salarioBruto - descontoSindicato - impostoDeRenda;
            double totalDescontos = impostoDeRenda + descontoSindicato;
            System.out.printf("Salário bruto: R$ %.2f%nIR: R$ %.2f\nDesconto do Sindicato: R$ %.2f%nFGTS: R$ %.2f", salarioBruto, impostoDeRenda, descontoSindicato, valorFGTS);
            System.out.printf("\nTotal de descontos: R$ %.2f\nSeu salário líquido será: R$ %.2f", totalDescontos, salarioLiquido);
        }else if (salarioBruto > 2500){
            double impostoDeRenda = (salarioBruto * 20) / 100;
            double salarioLiquido = salarioBruto - descontoSindicato - impostoDeRenda;
            double totalDescontos = impostoDeRenda + descontoSindicato;
            System.out.printf("Salário bruto: R$ %.2f%nIR: R$ %.2f\nDesconto do Sindicato: R$ %.2f%nFGTS: R$ %.2f", salarioBruto, impostoDeRenda, descontoSindicato, valorFGTS);
            System.out.printf("\nTotal de descontos: R$ %.2f\nSeu salário líquido será: R$ %.2f", totalDescontos, salarioLiquido);
        }
    }
}
