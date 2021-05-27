package officeHourPracrice_03_03;
import java.util.Scanner;

public class ScannerExam {
    public static void main (String [] args ){

        Scanner scan  = new Scanner (System.in);

        System.out.println( "How old are you ? ");

        int age = scan.nextInt();
        System.out.println(" I am " +age + " years old");

    }
}
