package day38_methods;
import static day38_methods.StringUtils.*;
/**
 * import all static methods. so that you can just call by method name, without classname
 */

public class StringUtilTest_Palindrome {
    public static void main(String[] args) {
        String userName = "";

        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("Fail:username can't be null or empty");

        }
        System.out.println("Is palindrome(civic) = "+ StringUtils.isPalindrome("civic"));
        System.out.println("Is palindrome (kayak) = " +StringUtils.isPalindrome("kayak"));
        System.out.println("is palindrome(Cybertek) = " +isPalindrome("Cybertek"));

        String word = "sunday";
        String revWord = StringUtils.reversed(word);
        System.out.println("word = " +word);
        System.out.println("The revWord  = "+ revWord);
        System.out.println(StringUtils.reversed(word));

    }
//        public static  boolean isPalindrome(String str) {
//        str = str.toLowerCase();
//            for (int i = 0; i < str.length() / 2; i++) {
//                if(str.charAt(i) != str.charAt(str.length()-i-1)){
//                    return false;
//                }
//
//            }
//                    return true;
//
//
//        }
//
//                           REVERSE
//  public static  String reversed(String str){
//        String reversed = "";
//
//        for(int i=str.length()-1;i >= 0;i--){
//               reversed += str.charAt(i);
//        }
//        return reversed;
//      }


}
