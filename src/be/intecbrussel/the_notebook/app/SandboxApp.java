package be.intecbrussel.the_notebook.app;

import java.util.ArrayList;
import java.util.List;

import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.service.ForestNotebook;

public class SandboxApp {

    public static void main(String[] args) {
        
        ForestNotebook forestNotebook = new ForestNotebook();

        Herbivore rabbit = new Herbivore("Rabbit", 5.00,0.40,0.70);
        Herbivore goat = new Herbivore("Goat", 25.00,0.80,1.10);
        
        List<Herbivore> herbivores = new ArrayList<>();
        herbivores.add(rabbit);
        herbivores.add(goat);

        forestNotebook.setHerbivores(herbivores);

        int animalsCount = forestNotebook.getAnimalCount();
        System.out.println("Animals count: " + animalsCount);


    }
    
}
