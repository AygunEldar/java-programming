package day56_abstraction.drivable;

import day56_abstraction.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void hi() {
        System.out.println("Welcome to our board");
    }

    @Override
    public void bye() {
        System.out.println("See you next flights");
    }

    @Override
    public void autoPilot() {
        System.out.println("Flying on Auto -pilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from --- to ---");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost " + (mile * 25.0) +" to fly " +mile + " miles");
    }
    public void land(){
        System.out.println(" We wish you good journey");
        }
}
