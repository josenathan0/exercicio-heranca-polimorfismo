package animal.service;

import animal.model.Animal;

public class Veterinario {
    public void realizarExame(Animal animal) {
        System.out.println("Realizando exame no animal...");
        animal.produzirSom();
    }
}
