package repls04;
import java.util.*;

public class SelectDigits {

    public static String extractNum(String s) {

        System.out.println(s.replaceAll("[a-z]",""));
//        String numbers ="";
//
//        for(int i =0; i < s.length();i++){
//
//            if(Character.isDigit(s.charAt(i))){
//
//                numbers  =numbers+s.charAt(i);
//
//            }
//            return numbers;
//        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }
}
