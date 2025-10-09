import java.util.Scanner;

public class DesafioExtra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Leia o nome do usuario (String) e a idade atual (int).

        System.out.print("Qual o nome do usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Qual a idade atual: ");
        int idadeAtual = scanner.nextInt();

        // TODO: Leia quantos anos no futuro deseja calcular (int).
        
        System.out.print("Digite quantos anos vão se passar: ");
        int anosFuturos = scanner.nextInt();

        // TODO: Calcule a idade futura somando idadeAtual + anosFuturos.

        int idadeFutura = idadeAtual + anosFuturos;

        // TODO: Exiba a mensagem: Daqui a X anos, [nome] tera Y anos.
        // Sugestao: use printf para formatar a mensagem final.

        System.out.printf("Daqui a %d anos, %s terá %d anos.%n", anosFuturos, nomeUsuario, idadeFutura);

        scanner.close();
    }
}
