package exercicios.python.brasil.estruturas_de_decisao.exercicios.python.brasil.estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual carne deseja comprar?\n(1): Filé duplo R$ 4,90Kg (5,80 acima de 5kg)\n(2): Alcatra R$ 5,90Kg  (6,80 acima de 5kg)\n(3): Picanha R$ 6,90 Kg (7,80 acima de 5kg)\n");
        int carneDesejada = scanner.nextInt();
        System.out.print("E quantos KG deseja? ");
        double quantidadeDeCarne = scanner.nextDouble();
        System.out.print("Qual a forma de pagamento? Utilizando nosso cartão ganhará mais 5% de desconto!\n(1): Cartão tabajara\n(2): Dinheiro\n(3): Débito/crédito.\n");
        int formaDePagamento = scanner.nextInt();
        double precoFile = 4.90;
        double precoAlcatra = 5.90;
        double precoPicanha = 6.90;
        boolean maisDe5Kg = quantidadeDeCarne > 5;
        boolean comprarFileDuplo = carneDesejada == 1;
        boolean comprarAlcatra = carneDesejada == 2;
        boolean comprarPicanha = carneDesejada == 3;
        boolean descontoTabajara = formaDePagamento == 1;
        boolean pagarDinheiro = formaDePagamento == 2;
        boolean pagarDebito = formaDePagamento == 3;

        if (maisDe5Kg) {
            double precoFile5kg = 5.80;
            double precoAlcatra5kg = 6.80;
            double precoPicanha5kg = 7.80;
            if (descontoTabajara) {
                double descontoCartao = 0.05;
                System.out.println("Por utilizar nosso cartão receberá 5% de desconto em sua compra.");
                if (comprarFileDuplo) {
                    double precoParcialFile = precoFile5kg * quantidadeDeCarne;
                    double descontoFile = precoParcialFile * descontoCartao;
                    double precoFinalFile = precoParcialFile - descontoFile;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de filé duplo.\nEconomizou com desconto: R$ " + descontoFile + "\nSeu pedido totalizou R$: " + precoFinalFile);
                }
                if (comprarAlcatra) {
                    double precoParcialAlcatra = precoAlcatra5kg * quantidadeDeCarne;
                    double descontoAlcatra = precoParcialAlcatra * descontoCartao;
                    double precoFinalAlcatra = precoParcialAlcatra - descontoAlcatra;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de Alcatra.\nEconomizou com desconto: R$ " + descontoAlcatra + "\nSeu pedido totalizou R$: " + precoFinalAlcatra);
                }
                if (comprarPicanha) {
                    double precoParcialPicanha = precoPicanha5kg * quantidadeDeCarne;
                    double descontoPicanha = precoParcialPicanha * descontoCartao;
                    double precoFinalPicanha = precoParcialPicanha - descontoPicanha;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de picanha.\nEconomizou com desconto: R$ " + descontoPicanha + "\nSeu pedido totalizou R$: " + precoFinalPicanha);
                }
            }
            if (pagarDinheiro) {
                System.out.println("Pagamento em dinheiro.");
                if (comprarFileDuplo) {
                    double precoParcialFile = precoFile5kg * quantidadeDeCarne;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de filé duplo.\nEconomizou com desconto: R$ 00,00" + "\nSeu pedido totalizou R$: " + precoParcialFile);
                }
                if (comprarAlcatra) {
                    double precoParcialAlcatra = precoAlcatra5kg * quantidadeDeCarne;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de Alcatra.\nEconomizou com desconto: R$ 00,00" + "\nSeu pedido totalizou R$: " + precoParcialAlcatra);
                }
                if (comprarPicanha) {
                    double precoParcialPicanha = precoPicanha5kg * quantidadeDeCarne;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de picanha.\nEconomizou com desconto: R$ 00,00" + "\nSeu pedido totalizou R$: " + precoParcialPicanha);
                }
            }
            if (pagarDebito) {
                System.out.println("Pagamento com cartão de crédito/débito.");
                if (comprarFileDuplo) {
                    double precoParcialFile = precoFile5kg * quantidadeDeCarne;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de filé duplo.\nEconomizou com desconto: R$ 00,00" + "\nSeu pedido totalizou R$: " + precoParcialFile);
                }
                if (comprarAlcatra) {
                    double precoParcialAlcatra = precoAlcatra5kg * quantidadeDeCarne;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de Alcatra.\nEconomizou com desconto: R$ 00,00" + "\nSeu pedido totalizou R$: " + precoParcialAlcatra);
                }
                if (comprarPicanha) {
                    double precoParcialPicanha = precoPicanha5kg * quantidadeDeCarne;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de picanha.\nEconomizou com desconto: R$ 00,00" + "\nSeu pedido totalizou R$: " + precoParcialPicanha);
                }
            }
        } else {
            if (descontoTabajara) {
                double descontoCartao = 0.05;
                System.out.println("Por utilizar nosso cartão receberá 5% de desconto em sua compra.");
                if (comprarFileDuplo) {
                    double precoParcialFile = precoFile * quantidadeDeCarne;
                    double descontoFile = precoParcialFile * descontoCartao;
                    double precoFinalFile = precoParcialFile - descontoFile;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de filé duplo.\nEconomizou com desconto: R$ " + descontoFile + "\nSeu pedido totalizou R$: " + precoFinalFile);
                }
                if (comprarAlcatra) {
                    double precoParcialAlcatra = precoAlcatra * quantidadeDeCarne;
                    double descontoAlcatra = precoParcialAlcatra * descontoCartao;
                    double precoFinalAlcatra = precoParcialAlcatra - descontoAlcatra;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de Alcatra.\nEconomizou com desconto: R$ " + descontoAlcatra + "\nSeu pedido totalizou R$: " + precoFinalAlcatra);
                }
                if (comprarPicanha) {
                    double precoParcialPicanha = precoPicanha * quantidadeDeCarne;
                    double descontoPicanha = precoParcialPicanha * descontoCartao;
                    double precoFinalPicanha = precoParcialPicanha - descontoPicanha;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de picanha.\nEconomizou com desconto: R$ " + descontoPicanha + "\nSeu pedido totalizou R$: " + precoFinalPicanha);
                }
            }
            if (pagarDinheiro) {
                System.out.println("Pagamento em dinheiro.");
                if (comprarFileDuplo) {
                    double precoParcialFile = precoFile * quantidadeDeCarne;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de filé duplo.\nEconomizou com desconto: R$ 00,00" + "\nSeu pedido totalizou R$: " + precoParcialFile);
                }
                if (comprarAlcatra) {
                    double precoParcialAlcatra = precoAlcatra * quantidadeDeCarne;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de Alcatra.\nEconomizou com desconto: R$ 00,00" + "\nSeu pedido totalizou R$: " + precoParcialAlcatra);
                }
                if (comprarPicanha) {
                    double precoParcialPicanha = precoPicanha * quantidadeDeCarne;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de picanha.\nEconomizou com desconto: R$ 00,00" + "\nSeu pedido totalizou R$: " + precoParcialPicanha);
                }
            }
            if (pagarDebito) {
                System.out.println("Pagamento com cartão de crédito/débito.");
                if (comprarFileDuplo) {
                    double precoParcialFile = precoFile * quantidadeDeCarne;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de filé duplo.\nEconomizou com desconto: R$ 00,00" + "\nSeu pedido totalizou R$: " + precoParcialFile);
                }
                if (comprarAlcatra) {
                    double precoParcialAlcatra = precoAlcatra * quantidadeDeCarne;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de Alcatra.\nEconomizou com desconto: R$ 00,00" + "\nSeu pedido totalizou R$: " + precoParcialAlcatra);
                }
                if (comprarPicanha) {
                    double precoParcialPicanha = precoPicanha * quantidadeDeCarne;
                    System.out.println("Você comprou " + quantidadeDeCarne + "KG de picanha.\nEconomizou com desconto: R$ 00,00" + "\nSeu pedido totalizou R$: " + precoParcialPicanha);
                }
            }
        }
    }
}