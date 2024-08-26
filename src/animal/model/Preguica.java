package animal.model;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void produzirSom() {
        System.out.println("Shhhh Shhhh");
    }

    @Override
    public void executarAcao() {
        System.out.println("A preguiça está subindo lentamente na árvore");
    }
}
