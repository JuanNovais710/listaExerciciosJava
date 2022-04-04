package exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro lado do triângulo em CM: ");
        double primeiroLado = scanner.nextDouble();
        System.out.print("Informe o segundo lado do triângulo em CM: ");
        double segundoLado = scanner.nextDouble();
        System.out.print("Informe o terceiro lado do triângulo em CM: ");
        double terceiroLado = scanner.nextDouble();

        boolean formaUmTriangulo = (primeiroLado + segundoLado) > terceiroLado && (terceiroLado + primeiroLado) > segundoLado && (segundoLado + terceiroLado) > primeiroLado;
        boolean trianguloEquilatero = primeiroLado == segundoLado && primeiroLado == terceiroLado;
        boolean trianguloIsosceles = primeiroLado == segundoLado && primeiroLado != terceiroLado ||
                terceiroLado == segundoLado && terceiroLado != primeiroLado;
        boolean trianguloEscaleno = primeiroLado != segundoLado && segundoLado != terceiroLado && primeiroLado != terceiroLado;

        if(formaUmTriangulo) {
            System.out.print("Os 3 lados formam um triângulo:\n");
            if (trianguloEquilatero) {
                System.out.println("Equilátero.");
            }else if(trianguloIsosceles) {
                System.out.println("Isósceles.");
            }else if(trianguloEscaleno) {
                System.out.println("Escaleno.");
            }
        }else {
            System.out.println("Lados inválidos. Não formam um triângulo.");
        }
    }
}
