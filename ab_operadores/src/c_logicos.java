public class c_logicos {
    public static void main(String[] args) {
        // Declaração de variáveis
        boolean condicao1 = true;
        boolean condicao2 = false;

        // Operadores lógicos
        boolean and = condicao1 && condicao2; // E lógico
        boolean or = condicao1 || condicao2;  // OU lógico
        boolean not1 = !condicao1;            // Negação de condicao1
        boolean not2 = !condicao2;            // Negação de condicao2

        // Exibição dos resultados no console
        System.out.println("Condição 1 AND Condição 2: " + and);
        System.out.println("Condição 1 OR Condição 2: " + or);
        System.out.println("NOT Condição 1: " + not1);
        System.out.println("NOT Condição 2: " + not2);
    }
    
}
