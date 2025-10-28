public class bc_inteirosPositivos {
    public static void main(String[] args){
        // Loop for: exibe números inteiros positivos de 1 a 100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i); // Imprime o número atual
        }

        //Com o while
        int j = 1;
        while (j <= 100) {
            System.out.println(j); // Imprime o número atual
            j++; // Incrementa j para evitar loop infinito
        }
    }
    
}
