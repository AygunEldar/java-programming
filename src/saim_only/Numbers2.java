package saim_only;
import java.util.Scanner;

public class Numbers2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets compare ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 == num2 && num2 == num3){
          System.out.println("All integers are the same");
        } else if(num1 > num2 && num2 < num3){
            System.out.println( num2 + " is the smallest");
        }else if( num3 > num1 && num3 > num2){
            System.out.println("The biggest number from " + num2 +", " + num1 +" and "+ num3 +" is: "+num3);
        }
    }
}
