package exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a primeira nota do aluno: ");
        double primeiraNota = scanner.nextDouble();
        System.out.print("Informe a segunda nota do aluno: ");
        double segundaNota = scanner.nextDouble();
        int quantidadeDeProvas = 2;
        double mediaAluno = (primeiraNota + segundaNota) / quantidadeDeProvas;
        boolean conceitoA = mediaAluno >= 9.00 && mediaAluno <= 10.00;
        boolean conceitoB = mediaAluno >= 7.50 && mediaAluno < 9.00;
        boolean conceitoC = mediaAluno >= 6.0 && mediaAluno < 7.50;
        boolean conceitoD = mediaAluno >= 4.0 && mediaAluno < 6.0;
        boolean conceitoE = mediaAluno >= 0.00 && mediaAluno < 4.0;

        if (conceitoA) {
            System.out.printf("Sua primeira nota foi: %.2f%nSua segunda nota foi: %.2f%nParabéns sua média foi: %.2f. Está aprovado!! A!", primeiraNota, segundaNota, mediaAluno);
        } else if (conceitoB) {
            System.out.printf("Sua primeira nota foi: %.2f%nSua segunda nota foi: %.2f%nParabéns sua média foi: %.2f. Está aprovado! B!", primeiraNota, segundaNota, mediaAluno);
        }else if(conceitoC) {
            System.out.printf("Sua primeira nota foi: %.2f%nSua segunda nota foi: %.2f%nSua média foi: %.2f. Está aprovado. C!", primeiraNota, segundaNota, mediaAluno);
        }else if(conceitoD) {
            System.out.printf("Sua primeira nota foi: %.2f%nSua segunda nota foi: %.2f%nSua média foi: %.2f. Esforce-se mais. Está reprovado. D.", primeiraNota, segundaNota, mediaAluno);
        }else if(conceitoE) {
            System.out.printf("Sua primeira nota foi: %.2f%nSua segunda nota foi: %.2f%nSua média foi: %.2f. Esforce-se mais. Está reprovado. E.", primeiraNota, segundaNota, mediaAluno);
        }else {
            System.out.println("Notas inválidas.");
        }
    }
}
