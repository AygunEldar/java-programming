package day56_abstraction.drivable;

import day56_abstraction.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads.");
    }

    @Override
    public void cost(int mile) {
        System.out.println("tesla costs " +(mile * 0.1) + " to drive " +mile + "miles");

    }

    @Override
    public void autoPilot() {
        System.out.println("Tesla is driving on autonomous ");
    }

    @Override
    public void hi() {
        System.out.println("Tesla is saying 'Hello");
    }

    @Override
    public void bye() {
        System.out.println("Charge me or bye");
    }
}
