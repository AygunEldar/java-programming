package officehours04_12;
import  java .util.*;

public class EvenAndOdd {
    public static void main(String[] args) {
        int [] nums= {4,1,3,12,5,8,9,10,45};
        int even =0;
        int odd = 0;

        for(int eachNum : nums) {
            if (eachNum % 2 == 0) {
                even++;


            } else {
                odd++;

            }
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
