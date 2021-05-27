package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main (String [] args ){
        String carModel = "BMW x5";
        String driverName ="Batman";
        String licenseNum ="lll3456";
        short speed = 15 +0;
        boolean isAutomatic =true;
        char licenseClass = 'C';

        System.out.println("Car model: " + carModel);
        System.out.println("Driver name: " + driverName);
        System.out.println("License number: " + licenseNum);
        System.out.println("Speed is : "+ speed);
        System.out.println("It is automatic: " + isAutomatic);
        System.out.println("License class: " + licenseClass);
        System.out.println( driverName +  " is driving .");
        System.out.println("Driver name is " + driverName);
        System.out.println(driverName + " is driving " + carModel);
        System.out.println("Current speed is " +speed + "mph");
        System.out.println( isAutomatic  + " -  " +licenseClass);
    }
}
