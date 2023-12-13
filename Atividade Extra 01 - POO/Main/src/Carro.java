public class Carro {

    String marca;
    String modelo;
    String anoL;

    public Carro(String marca, String modelo, String anoL) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoL = anoL;
    }

    void mostrarDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Lançamento: " + anoL);
    }
    void alterarModelo(String novoModelo) {
        modelo = novoModelo;
    }
}

