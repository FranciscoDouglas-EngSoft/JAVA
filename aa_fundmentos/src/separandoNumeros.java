
/**
 * Exemplo: separadores de números em Java
 * ---------------------------------------
 * Desde o Java 7, é possível usar o caractere underline (_) para separar dígitos em números,
 * facilitando a leitura de valores grandes ou decimais. O underline não afeta o valor.
 *
 * Observação: O ponto (.) é usado apenas para separar parte inteira da decimal em números do tipo double/float.
 * Não pode ser usado como separador de milhares.
 */
public class separandoNumeros {
    public static void main(String[] args){
        // Separando números inteiros grandes com _
        int numeroGrande = 1_000_000; // igual a 1000000
        System.out.println("Número grande: " + numeroGrande);

        // Separando casas decimais com _ (apenas para facilitar leitura)
        double numeroDecimal = 1.234_567; // igual a 1.234567
        System.out.println("Número decimal: " + numeroDecimal);
    }
}
