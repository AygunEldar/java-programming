package April;
import java.util.*;

public class StringArray_reversed_10 {
    public static void main(String[] args) {

        String sentence = "today is java";
        String[] sent = sentence.split(" ");
        String reversed =" ";
        for(int i = sent.length-1; i >= 0; i--){
            reversed += sent[i]+" ";
        }
        System.out.println("Reversed sentence-- " + reversed);
    }
}
