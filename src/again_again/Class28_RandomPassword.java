package again_again;
import java.util.*;

public class Class28_RandomPassword {
   public static void main (String [] args ) {


       String source = "ABCDEFGHIJKLMOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-+=";
       Random random = new Random();
       String password = "";

       for(int i= 1; i <=8;i++) {
           int idx = random.nextInt(71);
          System.out.print(source.charAt(idx));//source.substring(idx, idx +1)
           password += source.charAt(idx);
       }
       System.out.println("\nYour password is " +password);
   }
}
