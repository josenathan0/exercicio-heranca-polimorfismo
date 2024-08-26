package animal.model;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void produzirSom() {
        System.out.println("Ih Ih");
    }

    @Override
    public void executarAcao() {
        System.out.println("O cavalo está galopando");
    }
}
