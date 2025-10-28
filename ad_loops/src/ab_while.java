// Exemplo simples de loop while em Java
// O loop while repete o bloco de código enquanto a condição for verdadeira
// Neste exemplo, imprime os números de 1 a 15
public class ab_while {
    public static void main(String[] args){
        // Inicializa i em 1
        int i = 1;
        // Enquanto i for menor ou igual a 15, executa o bloco
        while (i <= 15) {
            // Imprime o valor atual de i
            System.out.println("Número: " + i);
            i++; // Incrementa i a cada volta
        }
        // Mensagem final após o loop
        System.out.println("Fim do loop.");
    }
}
