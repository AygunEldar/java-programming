package day44_custom_classes;

public class Animal {
    String type;

    public void eat() {
        System.out.println(type +" eats");
    }

    public void eat(String food) {

        System.out.println("eats " +food);
    }
    public void speak(){
        System.out.println(type+ " speaks");
    }
}
