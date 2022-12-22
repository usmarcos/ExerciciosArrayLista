package Objetos;


public class Cliente {
    int id, idade;
    String nome, telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        setId(id);
        setNome(nome);
        setIdade(idade);
        setTelefone(telefone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void print() {
        System.out.println("ID: " + getId() + ", " +
                "Nome: " + getNome() + ", " +
                "Idade: " + getIdade() + " e " +
                "Telefone: " + getTelefone());
    }
}
