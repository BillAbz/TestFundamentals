package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class AnimalSorterByName implements Comparator<Animal> {
    
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Comparator<Animal> thenComparingDouble(ToDoubleFunction<? super Animal> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
