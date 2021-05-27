package repls04;
import java.util.*;

public class palindromeInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
      //  isPalindrome(true);
 }
    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

        String newNum = "" + num;
        for(int i=0; i < newNum.length()/2;i++){
            if(newNum.charAt(i) != newNum.charAt(newNum.length()-1-i)){
                System.out.println(false);
                break;
            }else{
                System.out.println(true);
            }
        }



    }
}
