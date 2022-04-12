import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cálculo crescimento populacional\nInforme a população do país A, e sua taxa de crescimento anual: ");
        double populacaoPaisA = scanner.nextDouble();
        float taxaCrescimentoPaisA = scanner.nextFloat();
        System.out.println("Informe a população do país B, e sua taxa de crescimento: ");
        double populacaoPaisB = scanner.nextDouble();
        float taxaCrescimentoPaisB = scanner.nextFloat();
        int anosNecessarios = 0;
        float taxaCrescimentoAEmPorcentagem = (taxaCrescimentoPaisA) / 100;
        float taxaCrescimentoBEmPorcentagem = (taxaCrescimentoPaisB) / 100;
        while (populacaoPaisA <= populacaoPaisB) {
            anosNecessarios ++;
            populacaoPaisA = populacaoPaisA + (populacaoPaisA * taxaCrescimentoAEmPorcentagem);
            populacaoPaisB = populacaoPaisB + (populacaoPaisB * taxaCrescimentoBEmPorcentagem);
        }
        System.out.printf("A população do país A chegará a: %.1f e a do país B: %.1f em %d anos", populacaoPaisA, populacaoPaisB, anosNecessarios);

     }
}
