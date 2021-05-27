package day24_loops;
import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        //System.out.println("Enter pin code:"); inloop it must be loop part
        int secretPinCode = 1234;
       int pinCode;
        do{ System.out.println("Enter pin code: ");
            pinCode = scan.nextInt();
        }while(secretPinCode != pinCode);

        System.out.println("Welcome to your account");




    }
}
