package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.*;

import java.util.LinkedHashSet;
import java.util.Set;

public class Herbivore extends Animal{
    private Set<Plant> plantDiet = new LinkedHashSet<>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        plantDiet.addAll(plantDiet);
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);

    }

    public void printDiet(){

    }

    @Override
    public String toString() {
        return "Herbivore{ " + super.getName() +
                ". plantDiet=" + plantDiet +
                " height = " + super.getHeight()+
                '}';
    }
}
