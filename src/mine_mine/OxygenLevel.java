package mine_mine;
import  java.util.Scanner;

public class OxygenLevel {

    public static void main (String [] args ){

        Scanner scan = new Scanner(System.in);

        System.out.println("Oxygen level of the tank");

        int level = scan.nextInt();
        if( level > 90){
            System.out.println("Your tank is full.");
        }else if(level > 80){
           System.out.println("Still okay. ");
        }else if( level > 70){
            System.out.println("Don 't go too far.");
        }else if( level > 60){
            System.out.println("Start to head back.");
        } else if( level > 50){
            System.out.println("Be careful now you are at 50% ");

        }
        System.out.println();
        System.out.println("*** ANYWAY BE CAREFUL ***");
    }
}
