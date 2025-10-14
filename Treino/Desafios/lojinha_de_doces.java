
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class lojinha_de_doces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        
        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada
        
        int calculo = 2 * dinheiro;
        
        System.out.print("O cliente obteve " + calculo + " doces");

    }
}
