import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Livro Interativo!");
        System.out.println("Você está em uma encruzilhada. Para onde deseja ir? (esquerda/direita)");
        String escolha1 = scanner.nextLine();

        if (escolha1.equalsIgnoreCase("esquerda")) {
            System.out.println("Você escolheu ir para a esquerda.");
            System.out.println("Você encontrou um rio. O que você quer fazer? (nadar/voltar)");
            String escolha2 = scanner.nextLine();

            if (escolha2.equalsIgnoreCase("nadar")) {
                System.out.println("Você tentou nadar no rio, mas acabou sendo arrastado pela correnteza.");
                System.out.println("Fim do Livro.");
            } else if (escolha2.equalsIgnoreCase("voltar")) {
                System.out.println("Você decidiu voltar para a encruzilhada.");
                System.out.println("Fim do Livro.");
            } else {
                System.out.println("Opção inválida. Fim do Livro.");
            }

        } else if (escolha1.equalsIgnoreCase("direita")) {
            System.out.println("Você escolheu ir para a direita.");
            System.out.println("Você encontrou uma caverna escura. O que você quer fazer? (entrar/voltar)");
            String escolha2 = scanner.nextLine();

            if (escolha2.equalsIgnoreCase("entrar")) {
                System.out.println("Você entrou na caverna e encontrou um tesouro!");
                System.out.println("Parabéns, você terminou o Livro com um final feliz!");
            } else if (escolha2.equalsIgnoreCase("voltar")) {
                System.out.println("Você decidiu voltar para a encruzilhada.");
                System.out.println("Fim do Livro.");
            } else {
                System.out.println("Opção inválida. Fim do Livro.");
            }

        } else {
            System.out.println("Opção inválida. Fim do Livro.");
        }

        scanner.close();
    }
}
