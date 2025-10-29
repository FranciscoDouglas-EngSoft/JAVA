
/**
 * Exemplo: operadores lógicos em Java
 * -----------------------------------
 * Mostra uso dos operadores AND (&&), OR (||) e NOT (!),
 * além de exemplos em expressões condicionais.
 */
public class c_logicos {
    public static void main(String[] args) {
        // Declaração de variáveis booleanas
        boolean condicao1 = true;
        boolean condicao2 = false;

        // Operadores lógicos
        boolean and = condicao1 && condicao2; // E lógico
        boolean or = condicao1 || condicao2;  // OU lógico
        boolean not1 = !condicao1;            // Negação de condicao1
        boolean not2 = !condicao2;            // Negação de condicao2

        System.out.println("Condição 1 AND Condição 2: " + and);
        System.out.println("Condição 1 OR Condição 2: " + or);
        System.out.println("NOT Condição 1: " + not1);
        System.out.println("NOT Condição 2: " + not2);

        // Exemplo: uso em expressão condicional
        int idade = 25;
        boolean maiorDeIdade = idade >= 18;
        boolean possuiCarteira = true;

        if (maiorDeIdade && possuiCarteira) {
            System.out.println("Pode dirigir!");
        } else {
            System.out.println("Não pode dirigir.");
        }
    }
}
