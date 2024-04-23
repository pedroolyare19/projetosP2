import java.util.Scanner;

public class LivroInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Livro Interativo!");
        System.out.println(
                "Você está em uma floresta misteriosa, em uma encruzilhada. Para onde deseja ir? (esquerda/direita)");
        String escolha1 = scanner.nextLine();

        if (escolha1.equalsIgnoreCase("esquerda")) {
            System.out.println("Você escolheu ir para a esquerda.");
            System.out.println("Você encontrou um rio. O que você quer fazer? (nadar/voltar)");
            String escolha2 = scanner.nextLine();

            if (escolha2.equalsIgnoreCase("nadar")) {
                System.out.println("Você tentou nadar no rio, mas acabou sendo arrastado pela correnteza.");
                System.out.println("Você acordou em uma caverna escura. O que você quer fazer? (explorar/ficar)");
                String escolha3 = scanner.nextLine();

                if (escolha3.equalsIgnoreCase("explorar")) {
                    System.out.println("Você encontrou uma saída secreta da caverna!");
                    System.out.println("Parabéns, você escapou e terminou o Livro com um final feliz!");
                } else if (escolha3.equalsIgnoreCase("ficar")) {
                    System.out.println("Você decidiu ficar na caverna e foi resgatado por viajantes.");
                    System.out.println("Você foi resgatado e terminou o Livro com um final alternativo.");
                } else {
                    System.out.println("Opção inválida. Fim do Livro.");
                }

            } else if (escolha2.equalsIgnoreCase("voltar")) {
                System.out.println("Você decidiu voltar para a encruzilhada.");
                System.out.println("Fim do Livro.");
            } else {
                System.out.println("Opção inválida. Fim do Livro.");
            }

        } else if (escolha1.equalsIgnoreCase("direita")) {
            System.out.println("Você escolheu ir para a direita.");
            System.out.println("Você encontrou uma trilha sinistra. O que você quer fazer? (seguir/voltar)");
            String escolha2 = scanner.nextLine();

            if (escolha2.equalsIgnoreCase("seguir")) {
                System.out.println("Você seguiu a trilha e encontrou uma cabana abandonada.");
                System.out.println(
                        "Dentro da cabana, você encontrou um mapa do tesouro! O que você quer fazer? (seguir/voltar)");
                String escolha3 = scanner.nextLine();

                if (escolha3.equalsIgnoreCase("seguir")) {
                    System.out.println("Você seguiu o mapa e encontrou um tesouro escondido!");
                    System.out.println("Parabéns, você terminou o Livro com um final feliz!");
                } else if (escolha3.equalsIgnoreCase("voltar")) {
                    System.out.println("Você decidiu voltar para a encruzilhada.");
                    System.out.println("Fim do Livro.");
                } else {
                    System.out.println("Opção inválida. Fim do Livro.");
                }

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
