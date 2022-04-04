package exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu gênero:\tF para feminino\tM para masculino: ");
        String generoInformado = scanner.nextLine();
        char feminino = 'F';
        char masculino = 'M';
        boolean generoFeminino = generoInformado.equals("F") || generoInformado.equals("f");
        boolean generoMasculino = generoInformado.equals("M") || generoInformado.equals("m");

        if (generoFeminino) {
            System.out.println("A letra F representa feminino");
        }else if (generoMasculino) {
            System.out.println("A letra M representa masculino");
        }else {
            System.out.println("Gênero inválido. ");
        }scanner.close();

    }
}
