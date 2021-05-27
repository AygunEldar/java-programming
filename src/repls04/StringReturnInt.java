package repls04;
import java.util.*;

public class StringReturnInt {
    public static int countAppearance(String[] arr,String t){

        int count =0;
        int countAppearance =Integer.parseInt(t);
        for(int n =0; n <arr.length; n++){
            count++;
            for(int k = t.length() ; n <=0;k++ ){

            }
            if(count != 1){
                countAppearance += count;

            }

        }

        return count;


    } //end  count_appearance

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        String word = in.next();
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs, word));
    }
    }
