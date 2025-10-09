import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Leia o nome do usuario usando scanner.nextLine().

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // TODO: Leia a idade do usuario usando scanner.nextInt().

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // TODO: Imprima a mensagem: Ola, [nome]! Voce tem [idade] anos.
        // Dica: use System.out.printf("Ola, %s! Voce tem %d anos.%n", nome, idade);

        System.err.printf("Ola, %s! Voce tem %d anos.%n", nome, idade);

        scanner.close();
    }
}
