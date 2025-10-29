
/**
 * Exemplo: operadores matemáticos em Java
 * ---------------------------------------
 * Mostra operações básicas (+, -, *, /, %) e uso da classe Math para cálculos avançados.
 */
public class a_matematicos {
    public static void main(String[] args) {
        // Operações básicas
        int a = 10;
        int b = 3;
        int soma = a + b;            // Adição
        int subtracao = a - b;       // Subtração
        int multiplicacao = a * b;   // Multiplicação
        double divisao = (double) a / b; // Divisão (cast para double)
        int modulo = a % b;          // Módulo (resto da divisão)

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

        // Operações avançadas com Math
        double potencia = Math.pow(a, b); // a elevado à b
        double raiz = Math.sqrt(a);       // raiz quadrada de a
        int valorAbsoluto = Math.abs(-b); // valor absoluto
        double seno = Math.sin(Math.PI / 2); // seno de 90 graus

        System.out.println("Potência: " + potencia);
        System.out.println("Raiz quadrada: " + raiz);
        System.out.println("Valor absoluto de -b: " + valorAbsoluto);
        System.out.println("Seno de 90 graus: " + seno);
    }
}
