public class cc_verificaMes {
    public static void main(String[] args){
        //Verificador de MÊs

        int mes = 5; // Mês a ser verificado (1-12)
        String nomeDoMes; // Variável para armazenar o nome do mês
        // Verifica o mês usando switch case legado
        switch(mes){
            case 1:
                nomeDoMes = "Janeiro";      // 1
                break;
            case 2:
                nomeDoMes = "Fevereiro";    // 2
                break;
            case 3:
                nomeDoMes = "Março";        // 3
                break;
            case 4:
                nomeDoMes = "Abril";        // 4
                break;
            case 5:
                nomeDoMes = "Maio";         // 5
                break;
            case 6:
                nomeDoMes = "Junho";        // 6
                break;
            case 7:
                nomeDoMes = "Julho";        // 7
                break;
            case 8:
                nomeDoMes = "Agosto";       // 8
                break;
            case 9:
                nomeDoMes = "Setembro";     // 9
                break;
            case 10:
                nomeDoMes = "Outubro";      // 10
                break;
            case 11:
                nomeDoMes = "Novembro";     // 11
                break;
            case 12:
                nomeDoMes = "Dezembro";     // 12
                break;
            default:
                nomeDoMes = "Mês inválido"; // Qualquer outro valor
        }
        // Exibe o nome do mês
        System.out.println("Nome do mês: " + nomeDoMes);
    }
}
