package interviewTasks_Saim;

import java.util.Arrays;

public class ReverseArrayInt {
    public static void main(String[] args) {
        int[] num = {4, 8, 9, 7, 6, 2};
       // System.out.println(reverse(Arrays.toString(num)));
    }

        public static int[] reverse ( int[] num){

            int[] result = new int[num.length];
            for (int i = num.length - 1, j = 0; i >= 0; i--, j++) {
                result[j] = num[i];
            }
            return result;
        }
    }
