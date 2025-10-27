// Exemplo de promoções automáticas em Java
// Demonstra como aplicar descontos automaticamente com base em regras simples
public class c_promocoes {
    public static void main(String[] args){
        // Variáveis de entrada
        boolean clienteVip = true;      // Indica se o cliente é VIP
        double valorCompra = 1500.0;    // Valor total da compra
        double desconto;                // Valor do desconto aplicado

        // Lógica de promoção automática
        if (clienteVip && valorCompra > 1000) {
            // Cliente VIP e compra acima de 1000 recebe 15% de desconto
            desconto = valorCompra * 0.15;
        } else if (valorCompra > 1000) {
            // Cliente comum com compra acima de 1000 recebe 10% de desconto
            desconto = valorCompra * 0.10;
        } else {
            // Compras abaixo de 1000 não recebem desconto
            desconto = 0;
        }

        // Exibe o resultado
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Desconto aplicado: R$ " + desconto);
        System.out.println("Valor final: R$ " + (valorCompra - desconto));
    }
}
