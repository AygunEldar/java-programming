package mine_mine;
import java.util.Scanner;
public class WholeLoop {
    public static void main(String[] args) {
        
//        int apple =1;
//
//        while(apple <= 10){
//            System.out.println("Eating applesssssssssssssss");
//            apple++;
//        }
//
//        System.out.println("No more apples:(");
//        System.out.println("***********************************************");
//
//        Scanner keyboard =new Scanner(System.in);
//        int number, count;
//        System.out.println("Enter a number");
//         number= keyboard.nextInt();
//
//         count =5;
//         while(count <= number){
//             System.out.println(count +", ");
//             count+=10;
//         }
//
//        System.out.println("*************************");

         Scanner keyboard =new Scanner (System.in);
         int total =0;
         System.out.println("Enter a positive number");
         int nextNum= keyboard.nextInt();
while(nextNum >0){
    total= total +nextNum;
    nextNum =keyboard.nextInt();
}
System.out.println("Sum of all the number"+total);


    }
    
}
