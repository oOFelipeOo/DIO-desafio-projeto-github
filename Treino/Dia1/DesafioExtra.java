import java.util.Scanner;

public class DesafioExtra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade atual: ");
        int idadeAtual = scanner.nextInt();

        System.out.print("Quantos anos no futuro você quer calcular? ");
        int anosNoFuturo = scanner.nextInt();

        int idadeFutura = idadeAtual + anosNoFuturo;
        System.out.printf("Daqui a %d anos, %s terá %d anos.%n", anosNoFuturo, nome, idadeFutura);

        scanner.close();
    }
}