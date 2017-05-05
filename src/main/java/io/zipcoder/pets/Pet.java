package io.zipcoder.pets;

import java.util.Comparator;

public class Pet implements Comparable<Pet>, Comparator<Pet>{
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "Hello";
    }

    public int compareTo(Pet p) {
        return this.getName().compareTo(p.getName());
    }

    public int compare(Pet p1, Pet p2) {
        return p1.compareTo(p2);
    }
}

class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Bark";
    }

}

class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Meow";
    }

}
class Pig extends Pet {

    public Pig(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Oink";
    }

}
