package exercicios.python.brasil.estruturas_de_decisao.exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno: ");
        double primeiraNota = scanner.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        double segundaNota = scanner.nextDouble();
        System.out.print("Digite a terceira nota do aluno: ");
        double terceiraNota = scanner.nextDouble();
        int quantidadeDeProvas = 3;
        double mediaAluno = ( primeiraNota + segundaNota + terceiraNota) / quantidadeDeProvas;

        boolean aprovadoComDistincao = mediaAluno == 10;
        boolean aprovado = mediaAluno >= 7 && mediaAluno < 10;

        if(aprovado) {
            System.out.printf("Parabéns, sua média foi: %.2f. Você está aprovado.", mediaAluno);
        }else if (aprovadoComDistincao) {
            System.out.printf("Parabéns!!! Sua média foi: %.2f. Aprovado com distinção!", mediaAluno);
        }else {
            System.out.printf("Sua média foi: %.2f, você está reprovado.", mediaAluno);
        }
    }
}
