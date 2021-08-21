package july;

import java.util.Arrays;

public class ArraysMerge {
    public static void main(String[] args) {

        int[] num1 = {5,8,1};
        int[] num2 = {2,3,6};

        System.out.println(Arrays.toString(mergeArrays(num1,num2)));

    }
    public static int [] mergeArrays(int [] n, int [] m){

        int[] d  =new int [n.length + m.length];

       int merge = 0 ;
       for (int each : n){
           d [merge ++] = each;
       }

       for(int each :  m){
           d[merge ++] = each;
       }
       return d;

    }
}
