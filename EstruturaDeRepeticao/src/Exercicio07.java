import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o 1º de 5 números aleatórios para descobrirmos o maior e menor: ");
        int numeroInformado = scanner.nextInt();
        int menorNumero, maiorNumero;
        menorNumero = numeroInformado;
        maiorNumero = numeroInformado;
        for(int i=2; i<=5; i++) {
              System.out.print("Informe o " + i + "º de 5 números aleatórios para descobrirmos o maior e menor: ");
              numeroInformado = scanner.nextInt();
        if(numeroInformado < menorNumero) {
            menorNumero = numeroInformado;
        }else if(numeroInformado > maiorNumero) {
            maiorNumero = numeroInformado;
        }
        }System.out.println("O menor número é: " + menorNumero + ".\nE o maior: " + maiorNumero);

    }
}
