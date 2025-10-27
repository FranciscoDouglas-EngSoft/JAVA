public class e_unarios {
    public static void main(String[] args) {
        // Declaração de variáveis
        int numero = 5;

        // Operadores unários
        int positivo = +numero;   // Mantém o valor positivo
        int negativo = -numero;   // Inverte o sinal para negativo
        numero++;                 // Incrementa o valor em 1
        numero--;                 // Decrementa o valor em 1

        // Exibição dos resultados no console
        System.out.println("Valor original: " + 5);
        System.out.println("Valor positivo: " + positivo);
        System.out.println("Valor negativo: " + negativo);
        System.out.println("Valor após incremento e decremento: " + numero);
    }
    
}
