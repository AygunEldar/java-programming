package july;

public class FibonachiNum {

    public static void main(String[] args) {
        fib(8);
        fiboSeries(20);
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

    public static void fiboSeries(int limit) {

        int a = 0;
        int b = 1;
        int count = 0;
        int c = 0;

        while (count < limit) {

            c = a + b;
            a = b;
            b = c;
            System.out.print(c + ", ");
            count++;

        }
    }
}