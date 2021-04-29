package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Objects;

public class Plant {
    private String name;
    private double height;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Plant)) {
            return false;
        }
        Plant other = (Plant) obj;
        return Objects.equals(name, other.name);
    }

    
}
