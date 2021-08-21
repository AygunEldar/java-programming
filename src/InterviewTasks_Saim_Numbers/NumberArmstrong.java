package InterviewTasks_Saim_Numbers;

public class NumberArmstrong {
    public static void main(String[] args) {

        System.out.println(isArmstrong(153));


    }

  //  public static boolean isArmstrong(int num) {
//
//        int a =0; int b = 0; int c = 0;
//        while(num >0){
//            a= num % 10;
//            num /=10;
//            b=b+(a*a*a);
//
//        }
//        return (c==b) ? true : false;


        // Saim's version

//        String str = "" + num;
//        int length = str.length();
//        for (int i = 0; i < length; i++) {
//            int eachDigit = Integer.parseInt(str.substring(i, i + 1));
//
//        }
//        return true;
//    }
     public static boolean isArmstrong(int num) {

         String strNum = "" + num;
         int power = strNum.length();
         int sum = 0;

         for (int i = 0; i < power; i++) {
             //  int temp = 1;
             int eachDigit = Integer.parseInt(strNum.substring(i, i + 1));
             sum += Math.pow(eachDigit, power);  // 1 ^ 3 = 1 * 1 * 1
             // 5 ^ 3 = 5 * 5 * 5
             //            for(int j = 0; j < power; j++) {
             //                temp *= eachDigit;
             //            }

         }
         return num == sum;
     }
}
