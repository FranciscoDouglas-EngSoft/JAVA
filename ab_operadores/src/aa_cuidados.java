public class aa_cuidados {
    public static void main(String[] args){
        //Cuidados ao usar operadores matematicos em Java
        // 1. Precedência de operadores
        // 2. Uso de parênteses para clareza
        // 3. Cuidado com divisão por zero
        // 4. Verificação de tipos ao usar operadores

        int a = 10;
        int b = 0;
        double c = 45.67;

        // Exemplo de precedência e uso de parênteses
        int resultado1 = a + 5 * 2; // Sem parênteses: 5*2 é calculado primeiro
        int resultado2 = (a + 5) * 2; // Com parênteses: a+5 é calculado primeiro
        System.out.println("Resultado sem parênteses: " + resultado1); // 20
        System.out.println("Resultado com parênteses: " + resultado2); // 30
        // Exemplo de cuidado com divisão por zero
        if(b != 0){
            double resultadoDivisao = (double) a / b;
            System.out.println("Resultado da divisão: " + resultadoDivisao);
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }   

        //Perca de dados ao usar operadores com diferentes tipos
        int resultado3 = a + (int) c; // c é convertido para int antes da operação
        System.out.println("Resultado da soma com conversão: " + resultado3); //
    }
    
}
