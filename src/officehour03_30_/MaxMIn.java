package officehour03_30_;
import java.util.*;

public class MaxMIn {
    public static void main(String[] args) {
Scanner input =new Scanner (System.in);
int first =input.nextInt();

        int max = first;
        int min =first;
//int num1=input.nextInt();
//int num2=input.nextInt();
//int num3=input.nextInt();
//
//        int max = 0;
//        if(num1 > max){
//            max =num1;
//        }
//        if(num2 > max){
//            max =num2;
//        }
//        if(num3 > max){
//            max =num3;
//        }


        for(int i = 0; i <5; i++){
            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number > max){
max = number;
            }
            if(number < min){
                min = number;
            }
        }
        System.out.println("max "+max);
        System.out.println("min"+min);

    }
}
