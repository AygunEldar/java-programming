package InterviewTasks_Saim_Numbers;

public class FactorialNumber {
     /*
    Write a return method that returns the factorial number of any given number
        Ex:
                Input: 5
                outPut: 120
                because 5 * 4 * 3 * 2 * 1 = 120
     */

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int num){
int result = 1;
        for (int i = 1; i <= num; i++) {

            result *= i;

        }
        return result;
    }
}
