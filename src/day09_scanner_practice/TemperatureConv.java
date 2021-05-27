package day09_scanner_practice;
import java.util.Scanner;

public class TemperatureConv {
    public static void main(String [] args ){

        Scanner input =new Scanner(System.in);
        System.out.println("Change F to C ");
        double faren = input.nextDouble();

        System.out.println("Temperature in F is " +faren+ " F");
        double cel = (faren -32)*5/9;
        System.out.println("Temperature in Celsius is "+cel+ " C");
    }

}
