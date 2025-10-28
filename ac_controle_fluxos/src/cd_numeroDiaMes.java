// Exemplo simples para verificar a quantidade de dias em um mês
// Considera ano bissexto para o mês de fevereiro
// Utiliza switch case legado para decidir o número de dias
public class cd_numeroDiaMes {
    public static void main(String[] args){
    // Verifica a quantidade de dias em um mês específico
    int mes = 2; // Mês (1-12)
    int ano = 2024; // Ano para considerar anos bissextos
    int diasNoMes; // Variável para armazenar o número de dias

        // Switch case legado: define o número de dias conforme o mês
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                diasNoMes = 31; // Meses com 31 dias
                break;
            case 4, 6, 9, 11:
                diasNoMes = 30; // Meses com 30 dias
                break;
            case 2:
                // Verifica se o ano é bissexto (divisível por 4 e não por 100, ou divisível por 400)
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    diasNoMes = 29; // Fevereiro em ano bissexto
                } else {
                    diasNoMes = 28; // Fevereiro em ano não bissexto
                }
                break;
            default:
                diasNoMes = 0; // Mês inválido
        }
        // Exibe o resultado
        System.out.println("Dias no mês: " + diasNoMes);
    }
}