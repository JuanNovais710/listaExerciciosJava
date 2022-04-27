import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número que deseja saber a tabuada: ");
        int numeroInformado = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            int resultado = numeroInformado * i;
            System.out.println(numeroInformado + " x " + i + " = " + resultado);
        }
    }
}
