import java.util.Scanner;

// Definição da classe Calculadora
class Calculadora {
    // Construtor vazio
    public Calculadora() {
    }

    // Método de soma
    public double soma(double a, double b) {
        return a + b;
    }

    // Método de subtração
    public double subtracao(double a, double b) {
        return a - b;
    }

    // Método de multiplicação
    public double multiplicacao(double a, double b) {
        return a * b;
    }

    // Método de divisão
    public double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN; // Retorna NaN (Not a Number) em caso de divisão por zero
        }
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        // Solicita ao usuário para fornecer dois números
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Realiza operações matemáticas
        System.out.println("Resultado da soma: " + calculadora.soma(num1, num2));
        System.out.println("Resultado da subtração: " + calculadora.subtracao(num1, num2));
        System.out.println("Resultado da multiplicação: " + calculadora.multiplicacao(num1, num2));
        System.out.println("Resultado da divisão: " + calculadora.divisao(num1, num2));

        scanner.close(); // Fecha o scanner para liberar recursos
    }
}
