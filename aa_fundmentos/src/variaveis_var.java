
/**
 * Exemplo: uso do var para declaração de variáveis em Java
 * ---------------------------------------------
 * Desde o Java 10, é possível usar 'var' para declarar variáveis locais com inferência de tipo.
 * O tipo é determinado automaticamente pelo valor atribuído na inicialização.
 *
 * Observações:
 * - 'var' só pode ser usado em variáveis locais (dentro de métodos).
 * - Não pode ser usado para parâmetros de métodos, atributos de classe ou variáveis sem inicialização.
 * - Facilita o código, mas é importante manter clareza e legibilidade.
 */
public class variaveis_var {
    public static void main(String[] args) {
        // Exemplos de declaração com var
        var idade = 30;               // inferido como int
        var salario = 4500.75;        // inferido como double
        var genero = 'F';             // inferido como char
        var ativo = false;            // inferido como boolean

        // Exibição dos valores no console
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Gênero: " + genero);
        System.out.println("Ativo: " + ativo);
    }
}
