public class Endereco {

    String rua;
    String cidade;
    String estado;

    public Endereco(String rua, String cidade, String estado) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;

    }

    void mostrarDetalhes() {
        System.out.println("Endereço: " + rua + ", " + cidade + ", " + estado );
    }
    void meMudei(String novaRua) {
        rua = novaRua;
    }
}

