// Exemplo simples de switch expression em Java (Java 14+)
// Utiliza o switch para imprimir o nome do dia da semana
public class bb_switchCase_expression {
    public static void main(String[] args){
    int dia = 3; // dia da semana (1-7)

        // Switch expression: imprime o nome do dia conforme o valor
        switch(dia){
            case 1 -> System.out.println("Domingo");         // 1
            case 2 -> System.out.println("Segunda-feira");   // 2
            case 3 -> System.out.println("Terça-feira");     // 3
            case 4 -> System.out.println("Quarta-feira");    // 4
            case 5 -> System.out.println("Quinta-feira");    // 5
            case 6 -> System.out.println("Sexta-feira");     // 6
            case 7 -> System.out.println("Sábado");          // 7
            default -> System.out.println("Dia inválido");   // Qualquer outro valor
        }
    // Mensagem final
    System.out.println("Fim do programa.");
    }
}
