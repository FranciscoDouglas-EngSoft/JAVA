// Exemplo simples do operador ternário em Java
// O operador ternário permite fazer uma verificação rápida em uma linha
// Sintaxe: condição ? valor_se_verdadeiro : valor_se_falso
public class ac_ternario {
    public static void main(String[] args){
    int idade = 20; // idade da pessoa

    // Se idade >= 18, retorna "Maior de idade", senão "Menor de idade"
    String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
    System.out.println(resultado);
    }
}
