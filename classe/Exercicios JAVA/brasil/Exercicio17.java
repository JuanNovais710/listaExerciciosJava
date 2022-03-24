package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TINTASHOP");
        System.out.print("Qual a área, em m², que deseja pintar? ");
        double areaCliente = scanner.nextDouble();
        double areaTinta = areaCliente / 6;
        double precoLata = 80.0;
        double quantidadeLitrosLata = 18;
        double precoGalao = 25.0;
        double quantidadeLitrosGalao = 3.6;
        double quantidadeLatasNecessarias = (areaCliente / quantidadeLitrosLata) / 6;
        double quantidadeGaloesNecessarios = (areaCliente / quantidadeLitrosGalao) / 6;
        double precoFinalLatas = precoLata * quantidadeLatasNecessarias;
        double precoFinalGaloes = precoGalao * quantidadeGaloesNecessarios;
        System.out.println("Comprando apenas latas de 18L você precisará de: " + quantidadeLatasNecessarias + " latas. Totalizando R$" + precoFinalLatas);
        System.out.println("Comprando apenas galões de 3.6L, você precisará de: " + quantidadeGaloesNecessarios + " galões. Totalizando R$" + precoFinalGaloes);

    }
}
