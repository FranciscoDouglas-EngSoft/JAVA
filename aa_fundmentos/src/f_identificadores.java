// Identificadores válidos em Java
// Identificadores são nomes dados a variáveis, métodos, classes, etc.
// Regras principais:
// - Devem começar por letra (A-Z, a-z), underscore (_) ou cifrão ($)
// - Podem conter letras, números, _ e $
// - Não podem começar por número
// - Não podem ser palavras reservadas da linguagem (ex: int, class, if)
// - Java diferencia maiúsculas de minúsculas (nome e Nome são diferentes)
// Convenção: use camelCase para variáveis e métodos, PascalCase para classes

public class f_identificadores {
    public static void main(String[] args) {
        // Exemplos de identificadores válidos em Java
        int idadeUsuario = 30;          // Letras e números
        double salarioMensal = 4500.75; // Letras e underscore
        String nomeCompleto = "João Silva"; // Letras maiúsculas e minúsculas
        boolean isAtivo = true;         // Convenção camelCase

        // Exibição dos valores no console
        System.out.println("Idade do Usuário: " + idadeUsuario);
        System.out.println("Salário Mensal: " + salarioMensal);
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Está Ativo: " + isAtivo);
    }
}
