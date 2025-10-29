
/**
 * Exemplo: operadores de comparação em Java
 * -----------------------------------------
 * Mostra como comparar valores numéricos e Strings, usando ==, !=, >, <, >=, <= e equals().
 */
public class b_comparacao {
    public static void main(String[] args) {
        // Comparação de inteiros
        int x = 10;
        int y = 20;
        boolean igual = (x == y);          // Igualdade
        boolean diferente = (x != y);      // Diferença
        boolean maior = (x > y);           // Maior que
        boolean menor = (x < y);           // Menor que
        boolean maiorOuIgual = (x >= y);   // Maior ou igual a
        boolean menorOuIgual = (x <= y);   // Menor ou igual a

        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou Igual: " + maiorOuIgual);
        System.out.println("Menor ou Igual: " + menorOuIgual);

        // Comparação de Strings
        String nome1 = "João";
        String nome2 = "João";
        String nome3 = new String("João");

        // == compara referências, equals() compara conteúdo
        System.out.println("nome1 == nome2: " + (nome1 == nome2)); // true (mesmo pool)
        System.out.println("nome1 == nome3: " + (nome1 == nome3)); // false (objetos diferentes)
        System.out.println("nome1.equals(nome3): " + nome1.equals(nome3)); // true (conteúdo igual)
    }
}
