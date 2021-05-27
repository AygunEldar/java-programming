package officeHourPracrice_03_03;
import java.util.Scanner;

public class MyEx2 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("* * * * * CHANGE FROM KM TO MILE * * * * *");
        double waykm = scan.nextDouble();
        double waymile = waykm/1.609;
        System.out.println("From here to there is " +waymile + " mile");
    }
}
