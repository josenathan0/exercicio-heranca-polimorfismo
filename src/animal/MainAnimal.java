package animal;

import animal.model.Animal;
import animal.model.Cachorro;
import animal.model.Cavalo;
import animal.model.Preguica;
import animal.service.Veterinario;
import animal.service.Zoologico;

import java.util.ArrayList;
import java.util.List;

public class MainAnimal {
    public static void main(String[] args) {

        Animal cachorro1 = new Cachorro("Caramelo", 4);
        Animal cavalo1 = new Cavalo("Pocotó", 8);
        Animal preguica1 = new Preguica("Soninho", 2);

        List<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(cachorro1);
        listaAnimais.add(cavalo1);
        listaAnimais.add(preguica1);

        System.out.println("--------------------");
        System.out.println("Sons dos Animais: \n");


        for (Animal animal : listaAnimais) {
            animal.produzirSom();
        }

        System.out.println("\n--------------------");

        Veterinario veterinario = new Veterinario();
        System.out.println("Na Clínica Veterinária: \n");


        veterinario.realizarExame(cachorro1);
        veterinario.realizarExame(cavalo1);
        veterinario.realizarExame(preguica1);

        System.out.println("\n--------------------");
        System.out.println("No Zoológico: \n");


        Animal cachorro2 = new Cachorro("Osvaldo", 3);
        Animal cavalo2 = new Cavalo("Alexandre", 10);
        Animal preguica2 = new Preguica("Velocidade", 1);
        Animal cachorro3 = new Cachorro("Jacinto", 5);
        Animal cavalo3 = new Cavalo("Pé de pano", 13);
        Animal preguica3 = new Preguica("Coragem", 4);
        Animal cachorro4 = new Cachorro("Juliano", 2);

        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimalNaJaula(0, cachorro1);
        zoologico.adicionarAnimalNaJaula(1, cavalo1);
        zoologico.adicionarAnimalNaJaula(2, preguica1);
        zoologico.adicionarAnimalNaJaula(3, cachorro2);
        zoologico.adicionarAnimalNaJaula(4, cavalo2);
        zoologico.adicionarAnimalNaJaula(5, preguica2);
        zoologico.adicionarAnimalNaJaula(6, cachorro3);
        zoologico.adicionarAnimalNaJaula(7, cavalo3);
        zoologico.adicionarAnimalNaJaula(8, preguica3);
        zoologico.adicionarAnimalNaJaula(9, cachorro4);


        zoologico.percorrerJaulas();
    }
}
