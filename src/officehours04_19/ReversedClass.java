package officehours04_19;
import  day38_methods.StringUtils;
public class ReversedClass {
    /*
   Reverse Each word
   Given a String, reverse each individual word and print the result Hint: Use a nested loop, split
   Input:
   It started to snow in Chicago
   Output:
   tI detrats ot wons ni ogacihC

    */
    public static void main(String[] args) {

        System.out.println(reversedEachWord("It started to snow in Chicago"));
    }





    public static String reversedEachWord(String str){

        String reversed = " ";
        for (String each : str.split(" ")){

            reversed += StringUtils.reversed(each) +" ";
        }
        return reversed.trim();
    }
}
