import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        int numeroInformado = scanner.nextInt();
        boolean numerosPares = numeroInformado % 2 == 0;
        int recebeNumero = 0;
        for (int i = 2; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numeroInformado = scanner.nextInt();
            if (numerosPares) {
                recebeNumero = numeroInformado;
                System.out.println(recebeNumero);
            }
        }
    }
}