public class ae_continue {
    public static void main(String[] args){
        // Loop for: imprime números de 1 a 10
        // Se encontrar o número 5, pula para a próxima iteração com continue
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Número 5 encontrado, pulando para a próxima iteração.");
                continue; // Pula o restante do loop quando i é igual a 5
            }
            System.out.println("Número: " + i);
        }

        // Loop while: imprime números de 1 a 10
        // Se encontrar o número 5, pula para a próxima iteração com continue
        int j = 1;
        while (j <= 10) {
            if (j == 5) {
                System.out.println("Número 5 encontrado, pulando para a próxima iteração.");
                j++;
                continue; // Pula o restante do loop quando j é igual a 5
            }
            System.out.println("Número: " + j);
            j++;
        }
        // Mensagem final após os loops
        System.out.println("Fim dos loops.");
    }
    
}
