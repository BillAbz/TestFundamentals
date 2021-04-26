package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.*;
import java.util.stream.Stream;

public class ForestNotebook {
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new LinkedList<>();
    private List<Plant> plants =new LinkedList<>();

    public ForestNotebook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        this.plantCount = plants.size();
        return plantCount;
    }

    public int getAnimalCount() {
        this.animalCount = animals.size();
        return animalCount;
    }

    public void addAnimal(Animal animal){
        if (!animals.contains(animal.getName())) {
            animals.add(animal);
        }

    }

    public void addPlant(Plant plant){
        if (!plants.contains(plant.getName()))
            plants.add(plant);
    }

    public void printNotebook(){
        plants.forEach(plant -> System.out.println(plant));
        animals.forEach(animal -> System.out.println(animal));

    }

    public void sortAnimalsByName(){
        Comparator<Animal> compareByName = (Animal o1, Animal o2) ->
                o1.getName().compareTo(o2.getName());

        Collections.sort(animals, compareByName);


    }

    public void sortPlantsByName(){
        Comparator<Plant> compareByName = (Plant o1, Plant o2) ->
                o1.getName().compareTo(o2.getName());

        Collections.sort(plants, compareByName);

    }

    public void sortAnimalsByHeight(){
        Collections.sort(animals, Comparator.comparingDouble(Animal::getHeight)
                .thenComparingDouble(Animal::getWeight).reversed());

    }

    public void sortPlantsByHeight(){
        Collections.sort(plants, Comparator.comparingDouble(Plant::getHeight));
    }

}
