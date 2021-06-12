package day50_inheritance.inheritance_overriding;

import day50_inheritance.inheritance_overriding.Animal;

public class Dog extends Animal {

    public void run(){
        System.out.println("The dog is running.");


    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Dog is saying -hawhaw ");
    }

}
