import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("LOGIN\nInforme seu nome de usuário: ");
        String nomeDeUsuario = scanner.next();
        System.out.print("Senha: ");
        String senhaUsuario = scanner.next();

        while (nomeDeUsuario.equals(senhaUsuario)) {
            System.out.println("Sua senha não pode ser a mesma que seu nome de usuário. Tente novamente: ");
            System.out.print("Nome de usuário: ");
            nomeDeUsuario = scanner.next();
            System.out.print("Senha: ");
            senhaUsuario = scanner.next();
        }
        System.out.print("Logado com sucesso.");
    }
}
