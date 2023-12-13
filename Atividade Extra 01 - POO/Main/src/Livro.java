public class Livro {

    String titulo;
    String autor;
    int anoP;
    double preco;

    public Livro(String titulo, String autor, int anoP, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoP = anoP;
        this.preco = preco;
    }

    void mostrarDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoP);
        System.out.println("Preço: " + preco);
    }
    void alterarPreco(double novoPreco){
        preco=novoPreco;
    }
}
