// Exemplo simples de switch expression em Java (Java 14+)
// Permite atribuir valores diretamente usando o switch
// Aqui, cada estação do ano é definida conforme o mês
public class bc_switchCase_expression2 {
    public static void main(String[] args){
    int mes = 5; // mês do ano (1-12)

        // Switch expression: retorna a estação do ano conforme o mês
        String estação = switch(mes){
            case 12, 1, 2 -> "Verão";      // Dezembro, Janeiro, Fevereiro
            case 3, 4, 5 -> "Outono";      // Março, Abril, Maio
            case 6, 7, 8 -> "Inverno";     // Junho, Julho, Agosto
            case 9, 10, 11 -> "Primavera"; // Setembro, Outubro, Novembro
            default -> "Mês inválido";     // Qualquer outro valor
        };

    // Exibe o resultado
    System.out.println("Estação do ano: " + estação);
    }
}
