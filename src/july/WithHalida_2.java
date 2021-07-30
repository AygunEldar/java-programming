package july;

import java.util.Arrays;

public class WithHalida_2 {
    public static void main(String[] args) {

        String str = "java is fun";
        String[] words = str.split("");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);

        }
        System.out.println("*******************************");

        //PALINDROME
        String word = "madam";
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            rev = word;
        }

        if (word == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("No palindrome");
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        String palin = "civic";

        for (int i = 0; i < palin.length() / 2; i++) {


            if (palin.charAt(i) == palin.charAt((palin.length() - 1) - i)) {

            }
        }
        System.out.println("palindrome");

        System.out.println("---------REVERSE NUMBERS---------------");

        int[] nums = {4, 5, 3, 6, 7, 8, 9, 1, 2};

        for(int i = 0 ; i < nums.length/2; i++){

            int temp=nums[i];
            nums[i] = nums[(nums.length-1)-i];
            nums[(nums.length-1)-i] = temp;
        }
        System.out.println(Arrays.toString(nums));

        System.out.println("*******REV*********");

        String[] word1 = {"cat","bat","rat","sat","fat"};

        for(int i = 0 ; i < word1.length/2; i++){

            String temp = word1[i];
            word1[i] = word1[(word1.length-1)-i];
            word1[(word1.length-1)-i] = temp;
        }
        System.out.println(Arrays.toString(word1));

        System.out.println("$$$$$$$$$$$$$$$$$$$$");

        int num1 =20;
        int num2 =10;

//      num2=num2-num1;
//      num1=num1+num2;
//      num2=num1-num2;

        num1=num1-num2;
        num2=num2+num1;
        num1=num2-num1;



        System.out.println("num1 = "+num1);
        System.out.println("num2 ="+num2);
        System.out.println("************************");
        int num4 = 67;
        int num5 = 89;


        int num3 = num4;
        num4 = num5;
        num5 = num3;
        System.out.println("num4 = "+num4);
        System.out.println("num5 = "+num5);
    }
}
