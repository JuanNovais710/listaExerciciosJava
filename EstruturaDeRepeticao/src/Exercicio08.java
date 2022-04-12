import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double recebeMedia = 0;

        for(int i=1; i<=5; i++) {
            System.out.print("Informe o " + i + "º número: ");
            double numeroInformado = scanner.nextDouble();
            soma = soma + numeroInformado;
            recebeMedia = recebeMedia + numeroInformado;
        }double media = recebeMedia / 5;
        System.out.println("A soma dos números é: " + soma + "\nA média é: " + media);
    }
}
