package officehours04_07;

public class PrimeNumber {
    public static void main(String[] args) {

        int num = 50;
        for (int j = 2; j <= num; j++) {
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.print(num+ " ");
            }
        }
    }
}

