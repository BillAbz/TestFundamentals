package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.*;
import java.util.stream.Stream;

public class ForestNotebook {

    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new LinkedList<>();
    private List<Plant> plants = new LinkedList<>();

    public ForestNotebook() {

    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        for (Carnivore c : carnivores) {
            this.addAnimal(c);
        }
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        for(Omnivore o : omnivores){
            this.addAnimal(o);
        }
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        for(Herbivore h : herbivores){
            this.addAnimal(h);
        }
    }

    public int getPlantCount() {
        // this.plantCount = plants.size();
        return plantCount;
    }

    public int getAnimalCount() {
        // this.animalCount = animals.size();
        return animalCount;
    }

    public void addAnimal(Animal animal) {

        if (!animals.contains(animal)) {
            animals.add(animal);
            animalCount++;
        }

        if (animal instanceof Carnivore) {
            this.carnivores.add((Carnivore) animal);
        } else if (animal instanceof Omnivore) {
            this.omnivores.add((Omnivore) animal);
        } else if (animal instanceof Herbivore) {
            this.herbivores.add((Herbivore) animal);
        }
    }

    public void addPlant(Plant plant) {
        if (!plants.contains(plant)) {
            plants.add(plant);
            plantCount++;
        }
    }

    public void printNotebook() {
        plants.forEach(plant -> System.out.println(plant));
        animals.forEach(animal -> System.out.println(animal));

    }

    public void sortAnimalsByName() {

        this.animals.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));

        // Comparator<Animal> compareByName = (Animal o1, Animal o2) -> o1.getName().compareTo(o2.getName());
        // Collections.sort(animals, compareByName);

    }

    public void sortPlantsByName() {
        Comparator<Plant> compareByName = (Plant o1, Plant o2) -> o1.getName().compareTo(o2.getName());
        Collections.sort(plants, compareByName);
    }

    public void sortAnimalsByHeight() {
        Collections.sort(animals,
                Comparator.comparingDouble(Animal::getHeight).thenComparingDouble(Animal::getWeight).reversed());

    }

    public void sortPlantsByHeight() {
        Collections.sort(plants, Comparator.comparingDouble(Plant::getHeight));
    }

}
