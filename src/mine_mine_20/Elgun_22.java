package mine_mine_20;
import java.util.Scanner;

public class Elgun_22 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your number");

        int n = scan.nextInt();
        if(n%2 != 0){
            System.out.println( "weird");
        }else if(n %2==0 && n >= 2 && n <= 5){
            System.out.println("Not weird");
        }else if(n %2==0 && n>=6 && n <= 20){
            System.out.println("Weird");
        }else if(n%2==0 && n >20){
            System.out.println("Not weird");
        }
    }
}
