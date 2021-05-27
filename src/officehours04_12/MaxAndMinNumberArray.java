package officehours04_12;
import java.util.*;

public class MaxAndMinNumberArray {
    public static void main(String[] args) {
        int [] arr = {3,1,5,3,10,4,3};

        int max = arr[0];
        int min =arr[0];

        for(int each : arr){
            if(each < min) {
                min =each;
            }

              if(each > max){
                    max= each;
              }
        }

        System.out.println("Min numer is - "+min);
        System.out.println("Max numer is - "+max);
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr[0]));


    }
}
