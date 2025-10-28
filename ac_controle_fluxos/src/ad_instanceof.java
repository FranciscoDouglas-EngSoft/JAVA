// Exemplo simples do uso do operador instanceof em Java
// O operador instanceof verifica se um objeto pertence a uma determinada classe
public class ad_instanceof {
    public static void main(String[] args){
    Object obj = "Uma String qualquer"; // obj pode ser qualquer tipo

        // Verifica se obj é uma instância da classe String
        if (obj instanceof String) {
            // Se for, faz o cast para String de forma segura
            String str = (String) obj;
            System.out.println("A string tem " + str.length() + " caracteres.");
        } else {
            // Se não for, informa que não é uma String
            System.out.println("O objeto não é uma String.");
        }
    }
}
