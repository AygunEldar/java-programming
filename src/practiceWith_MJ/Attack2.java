package practiceWith_MJ;
import java.util.*;

public class Attack2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(),
                 input.nextInt(), input.nextInt()};

int day =0;
 int [] zeroDay =new int [inhabitants.length];
   do{
       System.out.println("Day " + day + " " +Arrays.toString(inhabitants));
       day++;
       if(inhabitants.length > 0) {

               for (int i = 0; i < inhabitants.length ; i++) {
                   inhabitants[i] = inhabitants[i] / 2;


           }
       }
   }while(!Arrays.toString(inhabitants).equals(Arrays.toString(zeroDay)));
        System.out.println("Day " + day + " " +Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");

    }

}
