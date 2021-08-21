package interviewTasks_Saim_Strings;

import java.util.InputMismatchException;

public class ConvertingStringToInteger {
    public static void main(String[] args) {
        System.out.println(convertToInteger("abc"));
    }
    public static int convertToInteger(String str){
        int result =0;
        int num =1;
        try{
            for(int i = str.length()-1;str.startsWith("-") ? i > 0 : i >=0;i--){
                char each =str.charAt(i);
                result += (each - '0') * num;
                num *= 10;
            }

        }catch (InputMismatchException e){
            return 0;
        }
        return result;
    }
}
