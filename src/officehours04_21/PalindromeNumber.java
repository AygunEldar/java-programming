package officehours04_21;

public class PalindromeNumber {
    public static void main(String[] args) {


        System.out.println(isPalindrome(12321));
    }


    public static boolean isPalindrome(int number){
         int reverse = 0;
         int temp = number;

       while (temp != 0){

           int lastDigit = temp % 10;
           reverse  = (reverse * 10) +lastDigit;
           temp /= 10;
          // System.out.println(reverse);



//           System.out.println("last digit "+number % 10);
//           number /= 10;
//           System.out.println("number after / 10 "+number % 10);
//           System.out.println();




       }


        return  reverse == number;
    }


}
