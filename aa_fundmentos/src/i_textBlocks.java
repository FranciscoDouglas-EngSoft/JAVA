public class i_textBlocks {
    public static void main(String[] args) {
        // Declaração de variáveis
        String nome = "Carlos";
        int idade = 35;
        double altura = 1.80;

        // Usando Text Blocks (Java 15+)
        String mensagem = """
                Nome: %s
                Idade: %d anos
                Altura: %.2f metros
                """.formatted(nome, idade, altura);

        // Exibição da mensagem no console
        System.out.println(mensagem);
    }
}
