package officeHourPracrice_03_03;
import java.util.Scanner;

public class MyExamples {
    public static void main (String [] args ){
       Scanner scan = new Scanner(System.in);
       System.out.println("Change t from C to F ");

       double celsius = scan.nextDouble();
       double faren = 32+celsius/5*9;
       System.out.println("Temperature is " + celsius +
               "C \n With Farenheit it is " + faren +"F ." );



    }
}
