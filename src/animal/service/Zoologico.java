package animal.service;

import animal.model.Animal;
import animal.model.Cachorro;
import animal.model.Cavalo;
import animal.model.Preguica;

public class Zoologico {
    private Animal[] jaulas = new Animal[10];

    public void adicionarAnimalNaJaula(int indice, Animal animal) {
        if (indice >= 0 && indice < jaulas.length) {
            jaulas[indice] = animal;
        } else {
            System.out.println("Índice inválido. Não foi possível adicionar o animal.");
        }
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.produzirSom();
                if (animal instanceof Cachorro || animal instanceof Cavalo || animal instanceof Preguica) {
                    animal.executarAcao();
                }
                System.out.println();
            }
        }
    }
}
