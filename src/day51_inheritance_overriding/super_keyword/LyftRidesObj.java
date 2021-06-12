package day51_inheritance_overriding.super_keyword;

public class LyftRidesObj {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LyftXL lyftXlRide = new LyftXL();
        Lux luxRide = new Lux();

        System.out.println("lyftRide.calculateRate 5 =  $ " + lyftRide.calculateRate(5));
        System.out.println("lyftXLRide.calculateRate 5 = $ " + lyftXlRide.calculateRate(5));
        System.out.println("LuxRide.calculateRate 5 = $ " + luxRide.calculateRate(5));


    }
}
