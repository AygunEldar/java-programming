package InterviewTasks;

public class SumArrays {
    public static void main(String[] args) {

        int[] a = {4, 4, 8, 29, 120};
        int[] b ={51, 6, 56, 9, 1};
        int [] c =new int[a.length];

       for(int i= 0 ; i < a.length; i++){
           c[i] = a[i] + b[i];

           System.out.print(c[i] + " ");

       }

    }

}
