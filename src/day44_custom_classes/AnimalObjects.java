package day44_custom_classes;

public class
AnimalObjects {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.type ="cheetah";
        animal.eat();
        animal.eat("meat");
        animal.speak();



        System.out.println();
        Animal reptiles =new Animal();
        animal. type = "crocodile";
        animal.eat();
        animal.eat("meat");
        animal.speak();

        //create object cheetahObj
        Animal cheetahObj =new Animal();
       cheetahObj.type ="Big cat";
        System.out.println(cheetahObj.type);
       cheetahObj.eat("meat");
       cheetahObj.speak();

        System.out.println();

      Animal fishObj =new Animal();
      fishObj.type ="salmon";
      fishObj.eat("fish");
      fishObj.speak();

    }

}
