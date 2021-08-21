package interviewTasks_Saim.All_Arrays;

import java.util.Arrays;

public class ReverseArrayInt {

    public static void main(String[] args) {
        int[] num = {4, 8, 9, 7, 6, 2};
        System.out.println(Arrays.toString(reverse(num)));
    }

        public static int[] reverse ( int[] num){

            int[] result = new int[num.length];
            for (int i = num.length - 1, j = 0; i >= 0; i--, j++) {
                result[j] = num[i];
            }
            return result;
        }
    }
