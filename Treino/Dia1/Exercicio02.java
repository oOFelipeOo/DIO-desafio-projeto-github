import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.printf("Soma: %.2f%n", soma);
        System.out.printf("Subtracao: %.2f%n", subtracao);
        System.out.printf("Multiplicacao: %.2f%n", multiplicacao);
        System.out.printf("Divisao: %.2f%n", divisao);

        scanner.close();
    }
}
