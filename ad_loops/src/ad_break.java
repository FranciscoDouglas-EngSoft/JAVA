// Exemplo simples do uso do break em loops for e while em Java
// O break serve para interromper a execução do loop imediatamente
public class ad_break {
    public static void main(String[] args){
        // Loop for: imprime números de 1 a 10
        // Se encontrar o número 5, interrompe o loop com break
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Número 5 encontrado, saindo do loop.");
                break; // Sai do loop quando i é igual a 5
            }
            System.out.println("Número: " + i);
        }

        // Loop while: imprime números de 1 a 10
        // Se encontrar o número 5, interrompe o loop com break
        int j = 1;
        while (j <= 10) {
            if (j == 5) {
                System.out.println("Número 5 encontrado, saindo do loop.");
                break; // Sai do loop quando j é igual a 5
            }
            System.out.println("Número: " + j);
            j++;
        }
        // Mensagem final após os loops
        System.out.println("Fim dos loops.");
    }
}
