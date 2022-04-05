package exercicios.python.brasil.estruturas_de_decisao.exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cálculo Equação de 2º grau.");
        System.out.print("Informe o valor de A: ");
        int variavelA = scanner.nextInt();
        System.out.print("Informe o valor de B: ");
        int variavelB = scanner.nextInt();
        System.out.print("Informe o valor de C: ");
        int variavelC = scanner.nextInt();
        double valorDelta = (Math.pow(variavelB, 2)) - 4*variavelA*variavelC;
        boolean naoESegundoGrau = variavelA == 0;

        if(naoESegundoGrau)
            System.out.println("O valor de A é igual 0. Isso impede a equação de ser de 2º grau.");
        else if(valorDelta < 0)
            System.out.print("O valor de delta é negativo. A equação não possui raízes reais.");
        else if(valorDelta == 0) {
            double variavelX = -variavelB + Math.sqrt(valorDelta) / (2 * variavelA);
            double variavelXDois = -variavelB - Math.sqrt(valorDelta) / (2 * variavelA);
            System.out.printf("A equação possui apenas uma raíz real: %.1f %.1f", variavelX, variavelXDois);
        }else if(valorDelta > 0) {
            double variavelX;
            variavelX = (-variavelB + Math.sqrt(valorDelta)) / 2 * (variavelA);
            double variavelXDois = (-variavelB - Math.sqrt(valorDelta)) / 2 * (variavelA);
            System.out.printf("O valor de delta foi: %.2f%nAs 2 raízes reasis são: %.2f e %.2f",valorDelta, variavelX, variavelXDois);
        }
    }
}
