package officehou0308.practice_03_16;

import java.util.Scanner;

public class CampusTime {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Campus Time Schedule: ");
        double time = scan.nextDouble();
        boolean isOpen = time > 8;

        if (time >= 8 && time <=  24 ){
            System.out.println("Open");
        }else if (!isOpen) {
            System.out.println("Closed");
        } else if (time < 0 || time > 24) {
            System.out.println("Invalid Time");
        }

    }
}
