package again_again;
import java.lang.*;
public class Class22_stringchar_index {
    public static void main (String [] args){
        String word="madam" ;

//        System.out.print(word.charAt(3));
//        System.out.print(word.charAt(2));
//        System.out.print(word.charAt(1));
//        System.out.println(word.charAt(0));

         String word2 =(""+word.charAt(4)+word.charAt(3)+word.charAt(2)
                       +word.charAt(1)+word.charAt(0));

        System.out.println("word = " +word);
        System.out.println("word2 = " + word2);

        if(word.equalsIgnoreCase(word2)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }



    }
}
