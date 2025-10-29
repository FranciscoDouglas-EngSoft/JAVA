
/**
 * Exemplo: Text Blocks em Java (Java 15+)
 * ---------------------------------------
 * Text Blocks permitem criar Strings multilinha de forma simples e legível,
 * usando três aspas duplas ("""").
 * São úteis para textos formatados, SQL, JSON, HTML, etc.
 * Podem ser combinados com .formatted() para interpolação de valores.
 */
public class i_textBlocks {
    public static void main(String[] args) {
        // Declaração de variáveis
        String nome = "Carlos";
        int idade = 35;
        double altura = 1.80;

        // Usando Text Blocks para criar uma mensagem formatada
        String mensagem = """
                Nome: %s
                Idade: %d anos
                Altura: %.2f metros
                """.formatted(nome, idade, altura);

        // Exemplo: Text Block para HTML
        String html = """
            <div>
                <h2>Dados do usuário</h2>
                <p>Nome: %s</p>
                <p>Idade: %d</p>
                <p>Altura: %.2f</p>
            </div>
        """.formatted(nome, idade, altura);

        // Exibição das mensagens no console
        System.out.println(mensagem);
        System.out.println("\nHTML gerado:\n" + html);
    }
}
