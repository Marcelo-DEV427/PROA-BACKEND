package comandoscondicionais;


public abstract class FestaDeAniversario {

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

class FestaDeAniversarioMain {

    public static void main(String[] args) {
    
        FestaDeAniversarioConcreta festa = new FestaDeAniversarioConcreta();

        
        festa.setTema("Festa Infantil");
        festa.setNumeroConvidados(50);
        festa.setData("15/12/2024");
        festa.setLocal("Salão de Festas Feliz");
        festa.setOrcamento(5000.00);

        
        System.out.println("Tema: " + festa.getTema());
        System.out.println("Número de Convidados: " + festa.getNumeroConvidados());
        System.out.println("Data: " + festa.getData());
        System.out.println("Local: " + festa.getLocal());
        System.out.println("Orçamento: R$" + festa.getOrcamento());

    
        festa.detalhesFesta();
    }
}
