package officeHourPracrice_03_03;
import java.util.Scanner;
public class MyExamp3 {
    public static void main(String [] args ){

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter Work Hours per a Day: ");
        double daily = scan.nextDouble();
        double weekly = daily*5;
        double monthly = weekly*4;
        double annual = monthly *12;
        System.out.println("My weekly work hours: " + weekly);
        System.out.println("My monthly work hours: " +monthly);
        System.out.println("My annual work hour is "+ annual);

    }
}
