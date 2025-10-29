
/**
 * Exemplo: tipo char em Java
 * --------------------------
 * O tipo char armazena um único caractere Unicode, usando aspas simples.
 * Pode ser usado para letras, dígitos, símbolos ou caracteres especiais.
 * Também pode ser convertido para int, mostrando o código Unicode do caractere.
 */
public class tipo_char {
    public static void main(String[] args) {
        // Exemplo 1: declaração simples
        char letra = 'A'; // armazena o caractere 'A'
        System.out.println("O caractere armazenado é: " + letra);

        // Exemplo 2: char como número (código Unicode)
        int codigo = letra; // conversão implícita para int
        System.out.println("O código Unicode de 'A' é: " + codigo); // 65

        // Exemplo 3: outros caracteres
        char simbolo = '@';
        char digito = '7';
        char especial = '\u00E9'; // caractere 'é' usando Unicode
        System.out.println("Símbolo: " + simbolo);
        System.out.println("Dígito: " + digito);
        System.out.println("Especial: " + especial);
    }
}
