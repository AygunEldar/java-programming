package saim_only_03_20;
import java.util.Scanner;

public class CalculateSalary {
    public static void main (String [] args ){
        Scanner scan =new Scanner (System.in);

        System.out.println("lets calculate the salary");

        int hourlyRate = scan.nextInt();
        if(hourlyRate !=0 && hourlyRate > 0){
            int weeklyHours = scan.nextInt();
            System.out.println("Hourly rate = " +hourlyRate);

            if (weeklyHours < 65 && weeklyHours > 0){
                int weeks = scan.nextInt();
                System.out.println("Weekly hours = "+ weeklyHours);

                if(weeks >= 1 && weeks <= 52){
                    System.out.println("Weeks = " +weeks);
                }else{
                    System.out.println("Number of weeks cannot be less than 1 or greater than 52.");
                }
            }else{
                System.out.println("Weekly hours can't be less  than 1hour or greater than 65");
            }

        }else{
            System.out.println("Hourly rate can't be negative or zero");
        }

       //  double salary = hourlyRate * weeklyHours* weeks;

    }
}
