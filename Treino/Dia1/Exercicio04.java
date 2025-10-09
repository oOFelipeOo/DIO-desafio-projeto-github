import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Leia uma temperatura em Celsius (double).

        System.out.print("Informe a temperatura em Celsius: ");
        double tempCelsius = scanner.nextDouble();

        // TODO: Converta para Fahrenheit usando a formula: F = (C * 9 / 5) + 32.

        var converterCelFahr = (tempCelsius * 9 / 5) + 32;

        // TODO: Exiba o resultado com uma casa decimal usando System.out.printf.

        System.out.printf("A conversão de Celsius para Fahrenheit é: %.1f°%n", converterCelFahr);

        scanner.close();
    }
}
