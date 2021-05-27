package day34_void_method;

public class StartCheapCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        ShiftToDrive();
        pressGasPedal();
    }
    public static void pressGasPedal() {
        System.out.println("4.Hold steering wheel with 2 hansd and press gas pedal.Be careful ");

    }

    public static void seatInCar(){
        System.out.println("1. Open the door and seat in driver seat");

    }
       public static void startTheCar(){
           System.out.println("2. Insert the key to ignition and turn clockwise");
       }
    public static void ShiftToDrive() {
        System.out.println("3. Press brake pedal and put D");

    }


}
