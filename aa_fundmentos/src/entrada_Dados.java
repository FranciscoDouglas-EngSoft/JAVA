import java.util.Scanner;

public class entrada_Dados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        System.out.println("Você digitou: " + numero);
        sc.close();
    }
    
}
