package exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu salário: ");
        double salarioInformado = scanner.nextDouble();
        boolean salarioMenorQue280 = salarioInformado <= 280.00;
        boolean salarioEntre280E700 = salarioInformado >= 280.00 && salarioInformado < 700.00;
        boolean salarioEntre700e1500 = salarioInformado >= 700.00 && salarioInformado < 1500.00;

        if(salarioMenorQue280) {
            double aumento20 = (salarioInformado * 20) / 100;
            double salarioComAumentoDe20 = salarioInformado + aumento20;
            System.out.println("Com base em seu salário anterior de: R$" + salarioInformado +
                    " você receberá um aumento de 20%, em R$: " + aumento20 + ". Totalizando: R$" + salarioComAumentoDe20);
        }else if(salarioEntre280E700) {
            double aumento15 = (salarioInformado * 15) / 100;
            double salarioComAumentoDe15 = salarioInformado + aumento15;
            System.out.println("Com base em seu salário anterior de: R$" + salarioInformado +
                    " você receberá um aumento de 15%, em R$: " + aumento15 + ". Totalizando: R$" + salarioComAumentoDe15);
        }else if(salarioEntre700e1500) {
            double aumento10 = (salarioInformado * 10) / 100;
            double salarioComAumentoDe10 = salarioInformado + aumento10;
            System.out.println("Com base em seu salário anterior de: R$" + salarioInformado +
                    " você receberá um aumento de 10%, em R$: " + aumento10 + ". Totalizando: R$" + salarioComAumentoDe10);
        }else {
            double aumento5 = (salarioInformado * 5) / 100;
            double salarioComAumentoDe5 = salarioInformado + aumento5;
            System.out.println("Com base em seu salário anterior de: R$" + salarioInformado +
                    " você receberá um aumento de 5%, em R$: " + aumento5 + ". Totalizando: R$" + salarioComAumentoDe5);
        }scanner.close();
    }
}
