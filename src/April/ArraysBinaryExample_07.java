package April;
import java.util.*;

public class ArraysBinaryExample_07 {
    public static void main(String[] args) {

        String str ="github";

        char [] letters =str.toCharArray();
        System.out.println(Arrays.toString(letters));

        int[] num ={-4,23, 32, 54,66, 56, 78, 96,100};
        System.out.println(Arrays.binarySearch(num,23));
        System.out.println(Arrays.binarySearch(num,32));
        System.out.println(Arrays.binarySearch(num,96));
        System.out.println(Arrays.binarySearch(num,100));
        System.out.println(Arrays.binarySearch(num,-4));
        System.out.println(Arrays.binarySearch(num,56));
    }
}
