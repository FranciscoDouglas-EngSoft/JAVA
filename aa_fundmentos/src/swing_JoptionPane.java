import javax.swing.JOptionPane;

/**
 * Exemplo completo: Entrada, Saída e Confirmação com JOptionPane
 * --------------------------------------------------------------
 * Este exemplo mostra como:
 * - Ler dados do usuário via caixa de diálogo (entrada)
 * - Exibir uma mensagem de saída
 * - Solicitar confirmação antes de finalizar
 *
 * Fluxo:
 * 1. Usuário digita seu nome.
 * 2. Usuário digita sua idade (validação para número inteiro).
 * 3. Exibe mensagem personalizada com nome e idade.
 * 4. Pergunta se deseja confirmar os dados (sim/não).
 * 5. Exibe mensagem final conforme resposta.
 */
public class swing_JoptionPane {
    public static void main(String[] args){
        // Entrada: nome
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome não informado. Encerrando.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Entrada: idade (com validação)
        int idade = 0;
        boolean idadeValida = false;
        while (!idadeValida) {
            String idadeStr = JOptionPane.showInputDialog(null, "Digite sua idade:", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
            if (idadeStr == null) {
                JOptionPane.showMessageDialog(null, "Idade não informada. Encerrando.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                idade = Integer.parseInt(idadeStr.trim());
                idadeValida = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número inteiro válido para a idade.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Saída: mensagem personalizada
        String mensagem = String.format("Olá, %s! Você tem %d anos.", nome, idade);
        JOptionPane.showMessageDialog(null, mensagem, "Saída de Dados", JOptionPane.INFORMATION_MESSAGE);

        // Confirmação: usuário aprova os dados?
        int resposta = JOptionPane.showConfirmDialog(null, "Confirma os dados informados?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Dados confirmados com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Dados não confirmados. Tente novamente se desejar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}