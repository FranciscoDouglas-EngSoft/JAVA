// Exemplo simples de controle de fluxo usando if/else em Java
// Verifica se a pessoa pode entrar com base na idade ou se está acompanhada
// Se idade >= 18 OU acompanhado for true, permite entrada
// Caso contrário, bloqueia entrada
public class ab_if_else {
    public static void main(String[] args){
    int idade = 17; // idade da pessoa
    boolean acompanhado = true; // está acompanhado?

        // Se a idade for maior ou igual a 18 OU estiver acompanhado, pode entrar
        if (idade >= 18 || acompanhado){
            System.out.println("Pode entrar");
        } else {
            System.out.println("Não pode entrar");
        }
    }
}
