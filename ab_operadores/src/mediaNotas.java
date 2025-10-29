
/**
 * Exemplo: cálculo da média de notas com JOptionPane
 * --------------------------------------------------
 * Solicita três notas ao usuário, calcula a média e exibe o resultado formatado.
 * Utiliza caixas de diálogo para entrada e saída de dados.
 *
 * Entradas: três notas (double) entre 0 e 10.
 * Saída: média das notas com duas casas decimais.
 */
import javax.swing.JOptionPane;

public class mediaNotas {
    public static void main(String[] args){
        // Solicita a primeira nota ao usuário
        String input1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        double nota1 = Double.parseDouble(input1);

        // Solicita a segunda nota ao usuário
        String input2 = JOptionPane.showInputDialog("Digite a segunda nota:");
        double nota2 = Double.parseDouble(input2);


        String input3 = JOptionPane.showInputDialog("Digite a terceira nota:");
        double nota3 = Double.parseDouble(input3);

        // Calcula a média das três notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibe a média calculada
        JOptionPane.showMessageDialog(null, "A média das notas é: " + String.format("%.2f", media));
    }
    
}
