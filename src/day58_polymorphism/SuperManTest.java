package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {

        Father spMan =new SuperMan();
        spMan.playWithKid();
        spMan.feedKid();
        spMan.raiseKid();
        //spMan.work("SDET") -->ERROR because left side Father gives just its methods


        Workable wMan =new SuperMan();
        System.out.println("got paid $  " + wMan.getPaid());
        wMan.work("SDET");
        //wMan.playWithKids(); --->ERROR because it is not left side's workable class method

        SuperMan sMan = new SuperMan(); //NOT POLYMORPHISM
        sMan.getPaid();
        sMan.work("QE");
        sMan.feedKid();
        sMan.playWithKid();
        sMan.raiseKid();
    }
}
