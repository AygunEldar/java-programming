package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {

        //variable of workable and objects of superMan

       Workable workable = new SuperMan();
       workable.work("QA manager");
       workable.getPaid();

        ((Father)workable).raiseKid();
        ((SuperMan)workable).playWithKid();

       // DownCasting from WORKER TO SUPERMAN
        //from s super class type to a subclass type

        SuperMan superMan =(SuperMan) workable;
        superMan.feedKid();
        superMan.work("JavaDev");


    }
}
