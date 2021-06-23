package officehours06_22;

public class Target extends Shopping{
    //Create a concrete class Target - means the first non abstract class , should have all parent classes methods
    //    - Inherit Shopping and implement all abstract methods


    @Override
    public void buyItem() {
        System.out.println("Buying item from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("returning item to Target");

    }

}
