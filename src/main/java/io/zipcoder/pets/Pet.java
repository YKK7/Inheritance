package io.zipcoder.pets;

public class Pet {
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

    public void speak(){
        System.out.println("Hello");
    }
}

class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("Bark");
    }

}

class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("Meow");
    }

}
class Pig extends Pet {

    public Pig(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("Oink");
    }

}
