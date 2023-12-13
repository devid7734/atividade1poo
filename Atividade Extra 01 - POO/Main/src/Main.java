
public class Main {

    public static void main(String[] args) {

        System.out.println("\nAntes:\n");
        Pessoa p1 = new Pessoa("breno", "400.289.222-10", 51);
        p1.mostrarDetalhes();

        Livro l1 = new Livro("iluminado","steven king",2002,90.2);
        l1.mostrarDetalhes();

        System.out.println("\nDepois:\n");

        p1.aniversario();
        l1.alterarPreco(204.5);

        p1.mostrarDetalhes();
        l1.mostrarDetalhes();
    }
}