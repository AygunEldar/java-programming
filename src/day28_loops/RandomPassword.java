package day28_loops;
import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {

        String source ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvdxyz 0123456789_!@#$%^&*";

        Random random = new Random();//helps generate random number
        String password = "";
  for(int i= 1; i <= 8; i++){

      int index = random.nextInt(71);
      System.out.print(source.charAt(index));
      //source.substring(index,index+1)
      // password +=source.charAt(index);
    //  System.out.print(random.nextInt(source.length());
      password +=source.charAt(index);
  }
        System.out.println("\npassword = " + password);
    }
}
