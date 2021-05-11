package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main(String[] args) {

        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat("Spike", 13);
        System.out.println(spike.getWeight());

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());

        Cat salem = new Cat(8); //because cat is abstract, you must extend it

        Cat suki = new HouseCat("Suki", 8);
        suki.noise(); // this will call noise from HouseCat
        ((HouseCat) suki).isSatisfied(); //as long as suki really is a HouseCar, this works. isSatisfied is defined in HouseCat but not in Cat. This is a way to get aroudn being able to call something in HouseCat but not in Cat. You may get a runtime exepction. Should be avoided.
    }
}
