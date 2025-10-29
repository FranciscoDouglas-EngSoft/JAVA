
/**
 * Exemplo: operadores de atribuição em Java
 * -----------------------------------------
 * Mostra atribuição simples (=) e composta (+=, -=, *=, /=, %=),
 * explicando cada operação e exibindo o resultado final.
 */
public class d_atribuicao {
    public static void main(String[] args) {
        // Declaração e atribuição simples
        int numero = 10;
        System.out.println("Valor inicial: " + numero);

        // Atribuição composta
        numero += 5;  // Soma 5 (numero = numero + 5)
        System.out.println("Após += 5: " + numero);
        numero -= 3;  // Subtrai 3 (numero = numero - 3)
        System.out.println("Após -= 3: " + numero);
        numero *= 2;  // Multiplica por 2 (numero = numero * 2)
        System.out.println("Após *= 2: " + numero);
        numero /= 4;  // Divide por 4 (numero = numero / 4)
        System.out.println("Após /= 4: " + numero);
        numero %= 3;  // Resto da divisão por 3 (numero = numero % 3)
        System.out.println("Após %= 3: " + numero);

        // Exibição do resultado final
        System.out.println("Valor final de número: " + numero);
    }
}
