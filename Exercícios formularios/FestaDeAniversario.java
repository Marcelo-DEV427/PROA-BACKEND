package comandoscondicionais;

// Classe abstrata que define a estrutura de uma Festa de Aniversário
public abstract class FestaDeAniversario {
    // Atributos
    private String tema;
    private int numeroConvidados;
    private String data;
    private String local;
    private double orcamento;

    // Getters e Setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getNumeroConvidados() {
        return numeroConvidados;
    }

    public void setNumeroConvidados(int numeroConvidados) {
        this.numeroConvidados = numeroConvidados;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    // Método abstrato (poderia ser utilizado para adicionar mais funcionalidades)
    public abstract void detalhesFesta();
}
class FestaDeAniversarioConcreta extends FestaDeAniversario {

    @Override
    public void detalhesFesta() {
        // Este método imprime os detalhes da festa
        System.out.println("Detalhes da Festa de Aniversário:");
        System.out.println("Tema: " + getTema());
        System.out.println("Número de Convidados: " + getNumeroConvidados());
        System.out.println("Data: " + getData());
        System.out.println("Local: " + getLocal());
        System.out.println("Orçamento: R$" + getOrcamento());
    }
}
// Classe principal com o método main
class FestaDeAniversarioMain {

    public static void main(String[] args) {
        // Criando uma instância concreta de FestaDeAniversario
        FestaDeAniversarioConcreta festa = new FestaDeAniversarioConcreta();

        // Setando os valores através dos setters
        festa.setTema("Festa Infantil");
        festa.setNumeroConvidados(50);
        festa.setData("15/12/2024");
        festa.setLocal("Salão de Festas Feliz");
        festa.setOrcamento(5000.00);

        // Exibindo os valores através dos getters
        System.out.println("Tema: " + festa.getTema());
        System.out.println("Número de Convidados: " + festa.getNumeroConvidados());
        System.out.println("Data: " + festa.getData());
        System.out.println("Local: " + festa.getLocal());
        System.out.println("Orçamento: R$" + festa.getOrcamento());

        // Chama o método para imprimir os detalhes da festa
        festa.detalhesFesta();
    }
}
