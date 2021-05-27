package saim_only;
import java.util.Scanner;

public class ElgunAZE {
  public static void main (String [] args){

      Scanner scan = new Scanner(System.in);
      System.out.println("The number is even or odd");
      int num = scan.nextInt();
      boolean even = num%2==0;
      if ( even && num < 6){
          System.out.println(num + 5);
      }else if((!even) && num > 6){
          System.out.println(num + 4);
      }else{
          System.out.println(num);
      }
  }
}
