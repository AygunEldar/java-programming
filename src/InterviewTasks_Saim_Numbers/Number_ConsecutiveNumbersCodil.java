package InterviewTasks_Saim_Numbers;

import june.main;

public  class Number_ConsecutiveNumbersCodil {
    public static void main(String args[]) {

      //  solution(20);
        solution1(20);
    }

    public static void solution(int num) {

        for (int i = 1; i < num; i++) {
            if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
                System.out.println(" CodilityTestCoders");
            }
           else if (num % 2 == 0 && num % 3 == 0) {
                System.out.println(" CodilityTest");
            }
           else if (num % 2 == 0 && num % 5 == 0) {
                System.out.println( " CodilityTest");
            }
           else if ( num % 3 == 0 && num % 5 == 0) {
                System.out.println(" TestCoders");
            }
           else if (num % 2 == 0 ) {
                System.out.println( " Codility");
            }
           else if (num % 3 == 0 ) {
                System.out.println(" Test");
            }
           else if (num % 5 == 0 ) {
                System.out.println(" Coders");
            }else {
                System.out.println(i);
            }




                }

    }

    public static void solution1(int N) {
        String result = "";

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
               result += "CodilityTestCoders";
            } else if (i % 2 == 0 && i % 3 == 0) {
                result += "CodilityTest";
            } else if (i % 2 == 0 && i % 5 == 0) {
                result += "CodilityCoders";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result += "TestCoders";
            } else if (i % 2 == 0) {
                result += "Codility";
            } else if (i % 5 == 0) {
                result += "Coders";
            } else if (i % 3 == 0) {
                result += "Test";
            } else {
                result += i + "";
            }
        }
        System.out.println(result);
    }



}