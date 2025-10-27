public class d_inferencia {
    public static void main(String[] args) {
        // Exemplo de inferência de tipos em Java (Java 10+)
        var numeroInteiro = 42;          // Inferido como int
        var numeroDecimal = 3.14;        // Inferido como double
        var texto = "Olá, Mundo!";       // Inferido como String
        var ativo = true;                 // Inferido como boolean

        // Exibição dos valores e seus tipos no console
        System.out.println("Número Inteiro: " + numeroInteiro + " (Tipo: " + ((Object)numeroInteiro).getClass().getSimpleName() + ")");
        System.out.println("Número Decimal: " + numeroDecimal + " (Tipo: " + ((Object)numeroDecimal).getClass().getSimpleName() + ")");
        System.out.println("Texto: " + texto + " (Tipo: " + ((Object)texto).getClass().getSimpleName() + ")");
        System.out.println("Ativo: " + ativo + " (Tipo: " + ((Object)ativo).getClass().getSimpleName() + ")");
    }
}
