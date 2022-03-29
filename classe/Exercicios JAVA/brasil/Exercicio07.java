package exercicios.python.brasil;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado do quadrado: ");
        int ladoQuadrado = scanner.nextInt();
        int areaQuadrado;
        areaQuadrado = ladoQuadrado * ladoQuadrado;
        int dobroAreaQuadrado = areaQuadrado * 2;
        System.out.println("O valor da área, dobrada, calculada pelo tamanho do lado fornecido é: " + dobroAreaQuadrado);

    }
}
