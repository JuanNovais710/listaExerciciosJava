package exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio09_terminar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        int segundoNumero = scanner.nextInt();
        System.out.print("Informe o terceiro número: ");
        int terceiroNumero = scanner.nextInt();
        boolean menorNumeroA = primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero;
        boolean menorNumeroB = segundoNumero < primeiroNumero && segundoNumero < terceiroNumero;
        boolean menornumeroC = terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero;

        boolean numeroDoMeioA = primeiroNumero < segundoNumero && segundoNumero > terceiroNumero;
        boolean numeroDoMeioB = segundoNumero < primeiroNumero && primeiroNumero > terceiroNumero;
        boolean numeroDoMeioC = terceiroNumero < primeiroNumero && primeiroNumero > segundoNumero;

        boolean maiorNumeroA = primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero;
        boolean maiorNumeroB = segundoNumero > primeiroNumero && segundoNumero > terceiroNumero;
        boolean maiorNumeroC = terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero;

    }
}
