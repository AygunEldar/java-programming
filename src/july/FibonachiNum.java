package july;

public class FibonachiNum {

    public static void main(String[] args) {
        fib(8);
    }

    public static void fib(int num) {

        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }
    }
}