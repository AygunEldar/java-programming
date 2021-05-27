package repls04;
import java.util.*;

public class StringFind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {

        // your code here
        String result = "";
        for(int i=0; i< str.length(); i--){
            if(Character.isLetter(str.charAt(i))){

                for(int n =str.length()-1; n>=0; n--){
                    if(Character.isLetter(str.charAt(n))){
                        result += str.charAt(n);

                    }else{

                         return str;
                    }

                }
            }
            else{
                result += str.charAt(i);
            }
        }
        return result;

    }
    }

