import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        String nomeInformado = scanner.nextLine();
        int tamanhoNome = 3;
        tamanhoNome = nomeInformado.length();

        while (tamanhoNome < 3) {
            System.out.print("Digite um nome válido: ");
            nomeInformado = scanner.nextLine();
            tamanhoNome = nomeInformado.length();
        }
        System.out.print("A sua idade? ");
        int idadeInformada = scanner.nextInt();

        while (idadeInformada < 0 || idadeInformada > 150) {
            System.out.print("Digite uma idade válida: ");
            idadeInformada = scanner.nextInt();
        }
        System.out.print("Seu salário? ");
        double salarioInformado = scanner.nextDouble();

        while (salarioInformado < 0) {
            System.out.print("Salário deve ser maior que 0: ");
            salarioInformado = scanner.nextDouble();
        }
        System.out.println("O seu gênero? (F): Feminino\t(M): Masculino");
        String generoInformado = scanner.next();

        while (!generoInformado.equals("F") && !generoInformado.equals("f") && !generoInformado.equals("M") && !generoInformado.equals("m")) {
            System.out.println("Digite um gênero válido: \n(F): Feminino\t(M): Masculino");
            generoInformado = scanner.next();
        }
        System.out.println("Estado civil:\n(S): Solteiro\t(C): Casado\n(V): Viúvo(a)\t(D): Divorciado");
        String estadoCivil = scanner.next();

        while (!estadoCivil.equals("S") && !estadoCivil.equals("C") && !estadoCivil.equals("V") && !estadoCivil.equals("D") && !estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
            System.out.println("Estado civil inválido.\n(S): Solteiro\t(C): Casado\n(V): Viúvo(a)\t(D): Divorciado");
            estadoCivil = scanner.next();
        }
        System.out.printf("Olá, %s!\n", nomeInformado);
        System.out.printf("Idade: %d\n", idadeInformada);
        System.out.printf("Salário: %.2f\n", salarioInformado);
        System.out.println("Gênero: " + generoInformado);
        System.out.print("Estado civil: " + estadoCivil);
    }
}

