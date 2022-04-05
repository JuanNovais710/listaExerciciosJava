package com.company;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Telefonou para a vítima? \n(0): Não\t(1): Sim\n");
        int respostaUsuario = scanner.nextInt();
        System.out.print("Esteve no local do crime? \n(0): Não\t(1): Sim\n");
        int respostaUsuario1 = scanner.nextInt();
        System.out.print("Mora perto da vítima? \n(0): Não\t(1): Sim\n");
        int respostaUsuario2 = scanner.nextInt();
        System.out.print("Devia para a vítima? \n(0): Não\t(1): Sim\n");
        int respostaUsuario3 = scanner.nextInt();
        System.out.print("Já trabalhou com a vítima? \n(0): Não\t(1): Sim\n");
        int respostaUsuario4 = scanner.nextInt();
        int somaRespostas = respostaUsuario + respostaUsuario1 + respostaUsuario2 + respostaUsuario3 + respostaUsuario4;
        if(somaRespostas == 2)
            System.out.println("Suspeito.");
        else if(somaRespostas >= 3 && somaRespostas <=4)
            System.out.println("Cúmplice");
        else if(somaRespostas == 0)
            System.out.println("Você é inocente.");
        else {
            System.out.println("Você é assassino");
        }

    }
}
