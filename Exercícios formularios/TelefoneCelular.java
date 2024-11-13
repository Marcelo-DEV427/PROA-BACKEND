package comandoscondicionais;

public class TelefoneCelular {

    private String marca;
    private String modelo;
    private String cor;
    private String numero;
    private boolean temCamera;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isTemCamera() {
        return temCamera;
    }

    public void setTemCamera(boolean temCamera) {
        this.temCamera = temCamera;
    }

    // Método principal
    public static void main(String[] args) {

        TelefoneCelular celular = new TelefoneCelular();


        celular.setMarca("AGEOS");
        celular.setModelo("Redmi note 9");
        celular.setCor("Verde");
        celular.setNumero("11987654321");
        celular.setTemCamera(true);


        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Número: " + celular.getNumero());
        System.out.println("Tem câmera? " + celular.isTemCamera());
    }
}