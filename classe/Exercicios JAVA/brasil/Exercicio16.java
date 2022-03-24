package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("TINTASHOP\n");
        System.out.print("Seja bem-vindo.\nQual a área, em m², que deseja pintar? ");
        double areaCliente = scanner.nextDouble();
        double litroTinta = areaCliente / 3;
        double precoTinta = 80.0;
        System.out.print("Nossa tinta é vendida em latas de 18 litros, que custam R$" + precoTinta + " cada.");
        double quantidadeLatas =  (areaCliente / 18) / 3;
        double precoFinal = quantidadeLatas * precoTinta;
        System.out.print("\nVocê precisará de: " + quantidadeLatas + " latas de tinta, totalizando: R$" + precoFinal);
    }
}
