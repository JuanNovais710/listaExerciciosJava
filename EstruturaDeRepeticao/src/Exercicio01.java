import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota do aluno: (de 0 a 10)");
        double notaAluno = scanner.nextDouble();

        while (notaAluno < 0 || notaAluno > 10) {
            System.out.println("Valor inválido. Digite uma nota válida.");
            notaAluno = scanner.nextDouble();
        }
        System.out.println("A nota do aluno foi: " + notaAluno);
    }
}
