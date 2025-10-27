public class g_templateString {
    public static void main(String[] args) {
        // Declaração de variáveis
        String nome = "Ana";
        int idade = 28;
        double altura = 1.65;

        // Usando template strings (Java 15+ com Text Blocks)
        String mensagem = String.format("""
                Nome: %s
                Idade: %d anos
                Altura: %.2f metros
                """, nome, idade, altura);

        // Exibição da mensagem no console
        System.out.println(mensagem);
    }
}
