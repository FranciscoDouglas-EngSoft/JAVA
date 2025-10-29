
/**
 * Exemplo: casting explícito em Java
 * -----------------------------------
 * O casting explícito é necessário quando convertemos tipos maiores para menores,
 * pois pode haver perda de dados. Exemplo clássico: double para int.
 *
 * Observações:
 * - O valor decimal é truncado (parte decimal é descartada).
 * - Pode ser usado para conversão entre outros tipos compatíveis.
 */
public class casting_explicito {
    public static void main(String[] args){
        // Exemplo 1: double para int (perda da parte decimal)
        double numeroDecimal = 99.99;
        int numeroInteiro = (int) numeroDecimal; // Conversão manual
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Número inteiro (após casting explícito): " + numeroInteiro); // 99

        // Exemplo 2: float para int
        float valorFloat = 12.75f;
        int valorInt = (int) valorFloat;
        System.out.println("Float: " + valorFloat + " | Int: " + valorInt); // 12

        // Exemplo 3: long para int (possível perda se valor for muito grande)
        long valorLong = 1234567890123L;
        int valorInt2 = (int) valorLong;
        System.out.println("Long: " + valorLong + " | Int: " + valorInt2); // valor truncado
    }
}
