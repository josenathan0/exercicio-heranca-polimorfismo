package animal.model;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void produzirSom() {
        System.out.println("Au Au");
    }

    @Override
    public void executarAcao() {
        System.out.println("O cachorro está brincando com uma bola");
    }
}
