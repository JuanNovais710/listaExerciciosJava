import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Informe outro número (maior que o primeiro): ");
        int segundoNumero = scanner.nextInt();
        int numero = primeiroNumero;
        int recebeNumero = 0;
        do  {
            numero++;
            recebeNumero += numero;
        }while ((numero > primeiroNumero && numero < (segundoNumero - 1)));
        System.out.println(recebeNumero);

    }
}
