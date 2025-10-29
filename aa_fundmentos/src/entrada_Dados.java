import java.util.Scanner;

/**
 * Exemplo: leitura de dados do console com Scanner
 *
 * Propósito:
 * - Mostrar como ler um número inteiro a partir da entrada padrão (teclado).
 * - Demonstrar boas práticas mínimas (tratar entrada inválida e observação sobre sc.close()).
 *
 * Contrato (inputs / outputs):
 * - Entrada: um número inteiro digitado pelo usuário.
 * - Saída: imprime o número lido ou uma mensagem de erro se a entrada for inválida.
 *
 * Observações:
 * - Scanner.nextInt() lança InputMismatchException se o valor não for um inteiro.
 * - Fechar o Scanner (sc.close()) fecha o stream System.in; se o programa precisa ler
 *   mais dados depois, evite fechar System.in ou reorganize leituras para um único Scanner.
 */
public class entrada_Dados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();
            System.out.println("Você digitou: " + numero);
        } catch (java.util.InputMismatchException ex) {
            // Entrada inválida: usuário digitou algo que não é um inteiro
            System.out.println("Entrada inválida: por favor, digite um número inteiro.");
        } finally {
            // Fecha o Scanner e libera recursos. Atenção: fecha System.in também.
            sc.close();
        }
    }

}
