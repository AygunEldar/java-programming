package InterviewTasks;

import java.util.Arrays;

public class ArrayMax {
    public static void main(String[] args) {
        int[] num = {4,5,8,9};
        System.out.println(findMax(num));

        int [] num1 ={4,8,7,2,1,};
        findMin(num1);
    }
    public static int findMax(int[] num){

        Arrays.sort(num);
        int max = num[num.length-1];

      return max;

    }

    public static  void findMin(int[] num1){
         Arrays.sort(num1);
         int min = num1[0];

        System.out.println(min);

    }

}
