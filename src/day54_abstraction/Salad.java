package day54_abstraction;

public class Salad extends MenuItem{

    @Override
    public  void prepare(){
        System.out.println("Chop veggies");
    }
    @Override
    public  void serve(){
        System.out.println("Serve ...");
    }
}
