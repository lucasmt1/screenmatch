public class Filme {

    String nome;
    int dataDeLancamento;
    private double somaDasAvaliacoes;
    boolean incluidoNoPlano;
    private int totalDeAvaliacao;
    int duracaoEmMinuto;

    int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Data de lançamento: " + dataDeLancamento);
    }
    void avaliacao(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }
    double pegaMedia(){
       return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
