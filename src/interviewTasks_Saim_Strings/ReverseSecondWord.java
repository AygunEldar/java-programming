package interviewTasks_Saim_Strings;

public class ReverseSecondWord {
    public static void main(String[] args) {
        System.out.println(reverseSecond("I love java"));
    }
    public static String reverseSecond(String str){

        String []arr = str.split(" ");
        String rev= "";

        for(int i = arr[1].length()-1;i >=0;i--){
        
            rev += arr[1].charAt(i);

        }
        arr[1] = rev;
        String result = "";

        for(String each : arr){
            result += each + " ";
        }
        return result;
    }
}
