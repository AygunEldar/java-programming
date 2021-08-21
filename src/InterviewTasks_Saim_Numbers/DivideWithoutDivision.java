package InterviewTasks_Saim_Numbers;

public class DivideWithoutDivision {
    /**
     *  Write a method that can divide two numbers without using division operator
     * @param args
     */
    public static void main(String[] args) {
      divide(24,6);
    }
    public static void divide(int num1, int num2){

        if(num2 == 0){
            System.out.println("Invalid division");
            return;
        }
      int count =0;
        while(num1 >= num2 ){
            num1 -= num2;
            count++;

        }
        System.out.println(count + " , remainder is " +num1);
    }
}
