package day56_abstraction;

public class MountainLanguage implements Greeting{

    @Override
    public void hi() {
        System.out.println("Salam");
    }

    @Override
    public void bye() {

        System.out.println("Xudahafiz");
    }


}
