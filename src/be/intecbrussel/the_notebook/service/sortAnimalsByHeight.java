package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class sortAnimalsByHeight implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return 0;
    }

    @Override
    public Comparator<Animal> thenComparingDouble(ToDoubleFunction<? super Animal> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
