package day33_arrays;
import java.util.*;

public class ReverseArray_2_String {
    public static void main(String[] args) {

        String [] words =  {"java","html","js","ruby","css"};
        System.out.println("before reversed words = " + Arrays.toString(words));
        for(int i =0, j= words.length-1;i < words.length/2;i++,j--){
            String tempWord =words[i];
            words[i]=words[j];
            words[j] =tempWord;


        }
        System.out.println("words after reverse = " +Arrays.toString(words));

    }
}
