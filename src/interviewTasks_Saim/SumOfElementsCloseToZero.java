package interviewTasks_Saim;

import java.util.Arrays;

public class SumOfElementsCloseToZero {
    public static void main(String[] args) {

//        int [] a = {2,0,4,0};
//        int [] arr = {1,0,3,5};
//        System.out.println(Arrays.toString(getSumOfTwoClosestToZeroElements(a,arr));
    }
    public static int getSumOfTwoClosestToZeroElements(int[] a){
        int [] b = new int[2];
        int z= 0;

        for (int i =0 ;i < a.length; i++){
            for(int j = i + 1 ; j < a.length; j ++){
                int sum= a[i] + a[j];
                if(z == 0 );
                 z = sum;
                 if(Math.abs(sum) > 0 && Math.abs(sum) < Math.abs(z)){
                     z = sum;
                     b[0] = a [i];
                     b[1] = a [j];
                 }
            }
        }
        return  z;
    }
}
