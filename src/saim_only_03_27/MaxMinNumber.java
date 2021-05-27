package saim_only_03_27;
import java.util.*;

public class MaxMinNumber {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number:");
        int max =scan.nextInt();
        int i= 1;
         while(i <= 4){
            //System.out.println("Enter a number:");
            int a= scan.nextInt();

            if(a > max){
                max = a;
            }
            i++;
        }
        System.out.println(max+" is a max number");


        System.out.println("Enter a number:");
        int min =scan.nextInt();
        int j= 1;
        while(j <= 4){
           // System.out.println("Enter a number:");
            int a= scan.nextInt();

            if(a < min){
                min = a;
            }
            j++;
        }
        System.out.println(min+" is a min number");



    }
}
