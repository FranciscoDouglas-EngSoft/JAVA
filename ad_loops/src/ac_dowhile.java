// Exemplo simples de loop do-while em Java
// O loop do-while executa o bloco pelo menos uma vez antes de verificar a condição
// Neste exemplo, imprime os números de 1 a 15
public class ac_dowhile {
    public static void main(String[] args){
        // Inicializa i em 1
        int i = 1;
        // O bloco será executado pelo menos uma vez
        do {
            // Imprime o valor atual de i
            System.out.println("Número: " + i);
            i++; // Incrementa i a cada volta
        } while (i <= 15); // Repete enquanto i <= 15
        // Mensagem final após o loop
        System.out.println("Fim do loop.");
    }
}
