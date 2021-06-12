package day50_inheritance.inheritance_overriding;

import day50_inheritance.inheritance_overriding.Animal;

public class Cat extends Animal {

    public void jump(){
        System.out.println("Cat is jumping everywhere . ");

    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Cat is saying meaw");
    }
}
