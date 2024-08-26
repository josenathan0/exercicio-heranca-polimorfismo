package animal.model;

public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String obterNome() {
        return nome;
    }

    public int calcularIdade() {
        return idade;
    }

    public abstract void produzirSom();
    public abstract void executarAcao();
}
