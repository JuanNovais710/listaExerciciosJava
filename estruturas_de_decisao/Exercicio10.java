package exercicios.python.brasil.estruturas_de_decisao.exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o turno que você estuda? ");
        String turnoEstudado = scanner.nextLine();
        boolean turnoMatutino = turnoEstudado.equals("M") || turnoEstudado.equals("m");
        boolean turnoVespertino = turnoEstudado.equals("V") || turnoEstudado.equals("v");
        boolean turnoNoturno = turnoEstudado.equals("N") || turnoEstudado.equals("n");

        if (turnoMatutino)
            System.out.print("Bom dia!");
        else if (turnoVespertino)
            System.out.println("Boa tarde! ");
        else if (turnoNoturno)
            System.out.println("Boa noite");
        else {
            System.out.println("Turno inexistente!");
        }scanner.close();
    }
}
