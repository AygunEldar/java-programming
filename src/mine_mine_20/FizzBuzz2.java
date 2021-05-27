package mine_mine_20;

public class FizzBuzz2 {
    public static void main (String [] args ){

       int num =25;
       if (num % 5 ==0 && num % 6 ==0){
           System.out.println("FizzBuzz");
       }else if(num % 5 ==0){
           System.out.println("Fizz");
       }else if (num % 6 ==0){
           System.out.println("Buzz");
       }else{
           System.out.println(num);
       }

    }
}
