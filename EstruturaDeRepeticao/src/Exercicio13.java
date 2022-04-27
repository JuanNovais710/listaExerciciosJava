import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cálculo potência\nInforme a base: ");
        int basePotencia = scanner.nextInt();
        System.out.print("O expoente: ");
        int expoentePotencia = scanner.nextInt();
        int resultado = 1;
        for (int i = 1; i <= expoentePotencia; i++) {
           resultado *= basePotencia;
        }System.out.print(resultado);
    }
}
