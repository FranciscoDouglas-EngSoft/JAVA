// Exemplo simples de switch case legado em Java
// Utiliza o switch tradicional para atribuir o nome do dia da semana
public class cb_switchCase_Legacy {
    public static void main(String[] args){
        int dia = 4; // dia da semana (1-7)
        String nomeDoDia;
        // Switch case legado: atribui o nome do dia conforme o valor de 'dia'
        switch(dia){
            case 1:
                nomeDoDia = "Domingo";         // 1
                break;
            case 2:
                nomeDoDia = "Segunda-feira";   // 2
                break;
            case 3:
                nomeDoDia = "Terça-feira";     // 3
                break;
            case 4:
                nomeDoDia = "Quarta-feira";    // 4
                break;
            case 5:
                nomeDoDia = "Quinta-feira";    // 5
                break;
            case 6:
                nomeDoDia = "Sexta-feira";     // 6
                break;
            case 7:
                nomeDoDia = "Sábado";          // 7
                break;
            default:
                nomeDoDia = "Dia inválido";    // Qualquer outro valor
        }
        // Exibe o nome do dia
        System.out.println("Nome do dia: " + nomeDoDia);
    }
}
