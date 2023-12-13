public class Conta {

    String tipo, agencia, numero, banco;

    public Conta(String tipo, String agencia, String numero, String banco) {
        this.tipo = tipo;
        this.agencia = agencia;
        this.numero = numero;
        this.banco = banco;
    }

    void mostrarDetalhes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Agencia e Numero: " + agencia + "," + numero);
        System.out.println("Banco: " + banco);
    }
    void alterarTipo(String novoTipo) {
        tipo = novoTipo;
    }
}


