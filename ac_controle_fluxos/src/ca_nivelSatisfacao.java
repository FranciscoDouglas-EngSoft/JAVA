public class ca_nivelSatisfacao {
    public static void main(String[] args){
    int nivel = 4; // nível de satisfação (1-5)

        // Avalia o nível de satisfação usando switch expression
        String mensagem = switch(nivel){
            case 1 -> "Muito insatisfeito";   // 1
            case 2 -> "Insatisfeito";         // 2
            case 3 -> "Neutro";               // 3
            case 4 -> "Satisfeito";           // 4
            case 5 -> "Muito satisfeito";     // 5
            default -> "Nível inválido";      // Qualquer outro valor
        };

        // Imprime a mensagem correspondente ao nível de satisfação
        System.out.println("Nível de satisfação: " + mensagem);
    }
    
}
