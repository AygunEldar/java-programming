package InterviewTasks_Saim_Numbers;

public class Number_DivisibleBy3_5_15 {
    public static void main(String[] args) {
  divideBy(90);

    }
    public static void divideBy(int num){
      String divisibleBy15 = "";
      String divisibleBy5 = "";
      String divisibleBy3 = "";

        int[ ] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
            for (int each : arr) {

                if (each % 3 == 0 && each % 5 == 0 && each % 15 == 0) {
                    divisibleBy15  += each +" ";

                }
                if(each % 5==0){
                    divisibleBy5 += each + " ";
                }
                if(each % 3 == 0){
                    divisibleBy3 += each +" ";
                }
            }

        System.out.println( divisibleBy15 +" are divisible by 15");
        System.out.println( divisibleBy5 +" are divisible by 5");
        System.out.println( divisibleBy3 +" are divisible by 3");


    }
}
