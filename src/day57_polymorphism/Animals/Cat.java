package day57_polymorphism.Animals;

import day57_polymorphism.Animals.Animal;

public class Cat extends Animal {

    @Override
    public void makeNoise(){
        System.out.println(" Cat is saying < meow meow>");
    }
}
