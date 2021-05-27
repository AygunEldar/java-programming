package day25_loops;
import java.util.*;

public class StartEnd {
    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);
        System.out.println("Enter start and end numbers");
         int start =scan.nextInt();
         int end = scan.nextInt();

        for( int i = start; i <= end;i++){
            System.out.print(i+" ");
            if(start > end){
                System.out.println("Reverse numbering is not supported");
            }
        }





    }
}
