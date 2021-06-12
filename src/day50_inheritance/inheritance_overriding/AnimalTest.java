package day50_inheritance.inheritance_overriding;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name ="Rex";
        animal.type ="Husky";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();
      //  cat.jump();

        Dog dog = new Dog();
        dog.speak();
      //  dog.run();
    }
}
