package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número que deseja: ");
        int numeroInformado = scanner.nextInt();
        System.out.println("O número digitado foi: " + numeroInformado);
        scanner.close();
    }
}
