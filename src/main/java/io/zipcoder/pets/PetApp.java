package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

public class PetApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int num = sc.nextInt();

        ArrayList<Pet> list = new ArrayList<Pet>();

        for(int i = 0; i < num; i++){
            System.out.println("What is your pet's name?");
            String name = sc.next();
            System.out.println("What kind of pet is it?");
            String type = sc.next();
            if(type.equalsIgnoreCase("cat"))
                list.add(new Cat(name));
            else if(type.equalsIgnoreCase("dog"))
                list.add(new Dog(name));
            else if(type.equalsIgnoreCase("pig"))
                list.add(new Pig(name));
        }

        for (int j = 0; j < num; j++) {
            Pet a = list.get(j);
            System.out.println("Pet" + j + " type: " + a.getClass().getSimpleName() + "  Name: " + a.getName());
        }
    }


}
