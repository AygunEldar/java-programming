package day24_loops;

import javax.swing.*;

public class Alphabet {
    public static void main(String[] args) {
        
        char abc='a';
//        System.out.println("abc = " + abc);
//        abc++;
//        System.out.println("abc = " + abc);

    while(abc <='a'){
        System.out.print( abc+"");
        abc++;

    }
        System.out.println("*****************************");
     abc='z';
      while(abc >='a'){
          System.out.print(abc+" ");
          abc--;
      }


    }
}
