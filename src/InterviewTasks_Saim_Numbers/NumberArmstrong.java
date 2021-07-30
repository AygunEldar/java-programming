package InterviewTasks_Saim_Numbers;

public class NumberArmstrong {
    public static void main(String[] args) {

        System.out.println(isArmstrong(153));


    }

    public static boolean isArmstrong(int num) {
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

        String str = "" + num;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            int eachDigit = Integer.parseInt(str.substring(i, i + 1));

        }
        return true;
    }
}
