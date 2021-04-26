package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NatureApp {
    public static void main(String[] args) {

        ForestNotebook forestNotebook = new ForestNotebook();

        Tree cacao = new Tree("Cacao",12.00);
        Tree mango = new Tree("Mango", 35.00);
        Flower tulip = new Flower("Tulip", 0.60);
        Bush cactus = new Bush("Cactus", 1.70);
        Weed cannabis = new Weed("Cannabis", 0.85);
        Carnivore lion = new Carnivore("King",100.00,0.90,1.50);
        Omnivore bear = new Omnivore("Yogi",150.0,1.50,2.50);
        Herbivore giraffe = new Herbivore("Giraf", 200,5.00,2.00 );
        Omnivore monkey = new Omnivore("Monkey", 15.00,1.20,0.40);
        Carnivore wolf = new Carnivore("Wolf", 80.00,1.10,1.50);
        Herbivore rabbit = new Herbivore("Rabbit", 5.00,0.40,0.70);
        Herbivore goat = new Herbivore("Goat", 25.00,0.80,1.10);
        Carnivore fox = new Carnivore("Fox", 10.00,0.60,1.00);
        Herbivore buffalo = new Herbivore("Buffalo", 250.00, 1.80,2.00);


        List<Herbivore> herbivores = new LinkedList<Herbivore>();
        List<Carnivore> carnivores = new LinkedList<Carnivore>();
        List<Omnivore> omnivores = new LinkedList<Omnivore>();
        List<Tree> trees = new LinkedList<Tree>();
        List<Bush> bushes = new LinkedList<Bush>();
        List<Flower> flowers = new LinkedList<Flower>();
        List<Weed> weeds = new LinkedList<Weed>();

        List<Plant> plants = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();

        herbivores.add(giraffe);
        herbivores.add(rabbit);
        herbivores.add(goat);
        herbivores.add(buffalo);
        carnivores.add(lion);
        carnivores.add(wolf);
        carnivores.add(fox);
        omnivores.add(bear);
        omnivores.add(monkey);
        trees.add(cacao);
        trees.add(mango);
        bushes.add(cactus);
        flowers.add(tulip);
        weeds.add(cannabis);

        animals.addAll(herbivores);
        animals.addAll(omnivores);
        animals.addAll(carnivores);
        plants.addAll(trees);
        plants.addAll(bushes);
        plants.addAll(flowers);
        plants.addAll(weeds);

        forestNotebook.setHerbivores(herbivores);
        forestNotebook.setCarnivores(carnivores);
        forestNotebook.setOmnivores(omnivores);

        animals.forEach(animal -> forestNotebook.addAnimal(animal));
        plants.forEach(plant -> forestNotebook.addPlant(plant));


        System.out.println("Total animal: "+forestNotebook.getAnimalCount());
        System.out.println("Total plant: "+forestNotebook.getPlantCount());



        cacao.setLeafType(LeafType.HAND);
        cactus.setLeafType(LeafType.SPEAR);
        mango.setLeafType(LeafType.ROUND);
        tulip.setSmell(Scent.SOUR);
        cannabis.setArea(30.00);

        lion.setMaxFoodSize(3.00);
        wolf.setMaxFoodSize(2.00);
        fox.setMaxFoodSize(1.20);
        giraffe.addPlantToDiet(mango);
        monkey.addPlantToDiet(cannabis);
        rabbit.addPlantToDiet(tulip);
        goat.addPlantToDiet(tulip);
        buffalo.addPlantToDiet(cacao);

        System.out.println("------Herbivore------");
        herbivores.forEach(herbivore -> System.out.println(herbivore));

        System.out.println("------Carnivore------");
        carnivores.forEach(carnivore -> System.out.println(carnivore));

        System.out.println("------Omnivore------");
        omnivores.forEach(omnivore -> System.out.println(omnivore));


        System.out.println("----------Animals  and Plants----------");

        forestNotebook.printNotebook();

        System.out.println("----------Sort by name------------");

        forestNotebook.sortAnimalsByName();
        forestNotebook.sortPlantsByName();
        forestNotebook.printNotebook();

        System.out.println("----------Sort by height------------");
        forestNotebook.sortAnimalsByHeight();
        forestNotebook.sortPlantsByHeight();
        forestNotebook.printNotebook();







    }
}
