// Exemplo simples de switch expression para inicializar variável em Java (Java 14+)
// O switch retorna um valor conforme o dia da semana informado
public class bd_switchCase_initialization {
    public static void main(String[] args){
    String dia = "Terça-feira"; // dia da semana

        // Switch expression: retorna "Fim de semana", "Dia útil" ou "Dia inválido" conforme o valor de dia
        String tipoDeDia = switch (dia) {
            case "Sábado", "Domingo" -> "Fim de semana"; // Sábado e Domingo
            case "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira" -> "Dia útil"; // Dias úteis
            default -> "Dia inválido"; // Qualquer outro valor
        };
    // Exibe o tipo de dia
    System.out.println("Tipo de dia: " + tipoDeDia);
    }
}
