package again_again;
import java.util.*;

public class Class24_CountUntill {
    public static void main (String [] args){
       Scanner scan = new Scanner (System.in);
       System.out.println("Enter number to count until");
        int numberToStop =scan.nextInt();
        int start =1;
        while (start <= numberToStop){
            System.out.print(start+ " ");
            start ++;
        }




    }
}
