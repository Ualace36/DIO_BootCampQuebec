public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;

    Endereco endereco;

    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome= sobrenome;
        this.cpf = cpf;
    }

    public Cliente(String nome, String sobrenome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return
                 nome  + " " + sobrenome +
                " -- CPF: " + cpf +
                " Endereco: " + endereco;
    }
}
