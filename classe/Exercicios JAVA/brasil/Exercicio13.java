package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Olá! Qual o seu nome? ");
        String nomePessoa = scanner.nextLine();
        System.out.print("Seu gênero:\n0 para masculino\n1 para feminino\n");
        int generoPessoa = scanner.nextInt();
        boolean masculino = generoPessoa == 0;
        System.out.print("Digite sua altura: ");
        double alturaPessoa = scanner.nextDouble();

        if (!masculino) {
            double pesoIdealFeminino = (62.1 * alturaPessoa) - 44.7;
            System.out.println(nomePessoa + ", seu peso ideal seria: " + pesoIdealFeminino);
        } else {
            double pesoIdealMasculino = (72.7 * alturaPessoa) - 58;
            System.out.println(nomePessoa + ", seu peso ideal seria: " + pesoIdealMasculino);
        }scanner.close();
    }
}
