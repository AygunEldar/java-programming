package day56_abstraction.drivable;

public class DrivableTest {
    public static void main(String[] args) {

        Tesla model3 = new Tesla();

        model3.hi();
        model3.transportPeople();
        model3.autoPilot();
        model3.cost(25);
        model3.stop();
        model3.bye();


        Plane plane = new Plane();
        plane.hi();
        plane.start();
        plane.autoPilot();
        plane.cost(275);
        plane.land();
        plane.stop();
        plane.bye();


       //polymorphism:
        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Tesla();

        Transportation tp1 = new Plane();
        Transportation tp2 = new Tesla();


    }
}
