package io.zipcoder.superhumans;

public class Main {

    public static void main(String[] args) {
        Human chris = new Human("Chris", 36, "male", "Zipcoder", "820 District Drive");
        Human tim = new Human("Tim", 33, "male", "Orientation Coordinator", "250 South Main St.");

        chris.printInfo();
        tim.printInfo();

        SuperHuman matt = new SuperHuman("matt", -1, "male", "Zipcoder", "Somewhere in PA", true, "Zippy", "Shunpo");
        SuperHuman anthony = new SuperHuman("Anthony", -2, "male", "Zipcoder", "Somewhere in DE", false, "Anthony", "Sonido");

        matt.printInfo();
        anthony.printInfo();

        matt.setAge(32);
        anthony.setAge(29);

        matt.setAddress("King of Prussia, PA");
        anthony.setAddress("17 Marvin Dr.");
        anthony.setHeroName("TintColor");

        matt.printInfo();
        anthony.printInfo();
    }

}
