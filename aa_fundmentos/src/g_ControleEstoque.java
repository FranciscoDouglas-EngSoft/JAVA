public class g_ControleEstoque {
    public static void main(String[] args) {
        // Variáveis de entrada
        int estoqueAtual = 50;        // Quantidade atual em estoque
        int quantidadeMinima = 20;    // Quantidade mínima desejada
        int quantidadeMaxima = 100;   // Quantidade máxima permitida
        int quantidadeCompra = 0;     // Quantidade a ser comprada

        // Lógica de controle de estoque
        if (estoqueAtual < quantidadeMinima) {
            // Se o estoque atual for menor que o mínimo, calcular a compra necessária
            quantidadeCompra = quantidadeMaxima - estoqueAtual;
            System.out.println("Estoque baixo! Comprar " + quantidadeCompra + " unidades.");
        } else {
            // Se o estoque estiver adequado, não comprar nada
            System.out.println("Estoque adequado. Nenhuma compra necessária.");
        }
    }
    
}
