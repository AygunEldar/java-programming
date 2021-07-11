package InterviewTasks;

public class MinAndMaxWithoutArr {
    public static void main(String[] args) {
        int[] num ={5,7,10,9};
        System.out.println(findMax(num));

        int[] num1 = {9,8,11,16};
        System.out.println(findMin(num1));
    }

    public static int findMax(int[] num){

        int max = num[0];

        for (int i = 0; i < num.length; i ++){
            if(max < num[i]){
                max = num[i];

            }
        }
        return max;
    }

    public static int findMin(int[] num1){

        int min = num1[0];

        for (int i = 0; i < num1.length; i ++){
            if(min > num1[i]){
                min = num1[i];

            }
        }
        return min;
    }
}
