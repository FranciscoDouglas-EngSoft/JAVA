
/**
 * Exemplo: casting implícito em Java
 * -----------------------------------
 * O casting implícito ocorre quando o Java converte automaticamente um tipo menor para um tipo maior,
 * sem necessidade de conversão manual. Exemplo clássico: int para double.
 *
 * Observações:
 * - Não há perda de dados ao converter int para double.
 * - O inverso (double para int) exige casting explícito e pode perder dados.
 */
public class casting_implicito {
    public static void main(String[] args){
        // Variável do tipo int
        int numeroInteiro = 100;

        // Casting implícito: int para double
        double numeroDecimal = numeroInteiro; // Java converte automaticamente

        // Imprime os valores
        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número decimal (após casting implícito): " + numeroDecimal);
    }
}
