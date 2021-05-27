package mine_mine;
import java.util.Scanner;

public class Elgun_03_20 {
    public static void main (String [] args){

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your numbers");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((b-a)==(c-b)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }


    }

}
