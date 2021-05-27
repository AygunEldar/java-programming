package mine_mine_20;

public class FizzBuzz {
    public static void main (String [] args){

        int num= 18;
        if (num % 2 ==0 && num % 4 == 0){
            System.out.println("FizzBuzz");

            }else if(num % 2==0){
            System.out.println("Fizz");
        }else if (num % 4 ==0){
            System.out.println("Buzz");
        }else {
         System.out.println(num);
        }
        }
    }

