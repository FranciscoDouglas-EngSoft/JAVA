
/**
 * Exemplo: tipo String em Java
 * ----------------------------
 * String é uma classe que representa uma sequência de caracteres.
 * Permite diversas operações como concatenação, busca, extração e manipulação de texto.
 */
public class strings_tipo {
    public static void main(String[] args) {
        // Exemplo 1: declaração e exibição
        String saudacao = "Olá, Mundo!";
        System.out.println(saudacao);

        // Exemplo 2: concatenação de Strings
        String nome = "João";
        String mensagem = saudacao + " Meu nome é " + nome + ".";
        System.out.println(mensagem);

        // Exemplo 3: comprimento da String
        int comprimento = mensagem.length();
        System.out.println("O comprimento da mensagem é: " + comprimento);

        // Exemplo 4: acessando um caractere específico
        char primeiroCaractere = mensagem.charAt(0);
        System.out.println("O primeiro caractere da mensagem é: " + primeiroCaractere);

        // Exemplo 5: convertendo para maiúsculas/minúsculas
        System.out.println("Maiúsculas: " + mensagem.toUpperCase());
        System.out.println("Minúsculas: " + mensagem.toLowerCase());

        // Exemplo 6: verificando se contém uma palavra
        boolean contemNome = mensagem.contains("João");
        System.out.println("A mensagem contém 'João'? " + contemNome);

        // Exemplo 7: extraindo parte da String
        String trecho = mensagem.substring(0, 5);
        System.out.println("Trecho inicial: " + trecho);
    }
}
