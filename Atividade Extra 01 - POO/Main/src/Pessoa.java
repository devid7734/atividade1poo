public class Pessoa {

    String nome;
    String cpf;
    int idade;


    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }


    void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("Idade: " + idade);
    }

    void aniversario() {
        idade++;
    }
}
