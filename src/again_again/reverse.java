package again_again;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        String str ="ABCD";

       System.out.print( reverse(str));
    }

    public static  String reverse (String name){
       //  name ="ABCD";
        String reverse = "";
        for(int i = name.length()-1; i >=0; i--){
     // reverse += str;

            reverse += name.toCharArray()[i];

        }
         return reverse;

    }






}
