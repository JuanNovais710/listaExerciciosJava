package exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o preço do produto A: ");
        double precoProdutoA = scanner.nextDouble();
        System.out.print("Informe o preço do produto B: ");
        double precoProdutoB = scanner.nextDouble();
        System.out.print("Informe o preço do produto C: ");
        double precoProdutoC = scanner.nextDouble();
        boolean produtoMaisBaratoA = precoProdutoA < precoProdutoB && precoProdutoA < precoProdutoC;
        boolean produtoMaisBaratoB = precoProdutoB < precoProdutoA && precoProdutoB < precoProdutoC;
        boolean produtoMaisBaratoC = precoProdutoC < precoProdutoA && precoProdutoC < precoProdutoB;

        if (produtoMaisBaratoA) {
            System.out.println("O produto A custa: R$" + precoProdutoA + ". O mais em conta para comprar.");
        }if (produtoMaisBaratoB) {
            System.out.println("O produto B custa: R$" + precoProdutoB + ". O mais em conta para comprar.");
        }if (produtoMaisBaratoC) {
            System.out.println("O produto C custa: R$" + precoProdutoC + ". O mais em conta para comprar.");
        }scanner.close();
    }
}
