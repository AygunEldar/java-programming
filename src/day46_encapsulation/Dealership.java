package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {

        Car car1 = new Car();


        // car1.model ="Nissan"; ERROR it is PRIVATE

       car1.setModel("Nissan Altima");
        System.out.println("car1 model is " +car1.getModel());

       car1.setYear(2020) ;
        System.out.println("car1 year is " + car1.getYear());


        car1.setMileage(70000);
        System.out.println("car1 mileage is " + car1.getMileage());

        //System.out.println(car1.toString());
        System.out.println(car1);//automatically calls toString

        System.out.println("**********************");
        Car alfaRomeo =new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16660);
        System.out.println("Model = " + alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getYear());
        System.out.println("Mileage = " + alfaRomeo.getMileage());
        System.out.println(alfaRomeo);
    }
}