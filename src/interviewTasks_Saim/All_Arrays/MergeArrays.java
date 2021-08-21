package interviewTasks_Saim.All_Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int []num1 ={1,2,3,};
        int [] num2 = {4,5,6,};

         sumArrays(num1,num2);

             }
    /**
     * merge two arrays
     */

    public static void sumArrays(int[]a, int [] b){

        int [] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {

            c[i] = a[i] +b[i];
            System.out.print(c[i] + " ");
        }

    }


}
