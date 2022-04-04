package exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a primeira nota do aluno: ");
        double primeiraNotaAluno = scanner.nextDouble();
        System.out.print("Insira a segunda nota do aluno: ");
        double segundaNotaAluno = scanner.nextDouble();
        int totalDeProvas = 2;
        double mediaAluno = (primeiraNotaAluno + segundaNotaAluno) / totalDeProvas;

        if(mediaAluno >= 7 && mediaAluno < 10) {
            System.out.println("A média do aluno foi: " + mediaAluno + ". O aluno está aprovado!!");
        }else if(mediaAluno < 7 && mediaAluno >= 0) {
            System.out.println("A média do aluno foi: " + mediaAluno + ". O aluno está reprovado.");
        }else if(mediaAluno == 10) {
            System.out.println("Parabéns! Sua média foi: " + mediaAluno + ". Aprovado com distinção.");
        }else {
            System.out.println("Notas inválidas. ");
        }scanner.close();
    }
}
