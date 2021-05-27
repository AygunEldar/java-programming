package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {

        for (int n = 1; n <= 5; n++) {
            System.out.print(n);

            if (n == 3) {
                break;
            }
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i == 3 || i == 4) {


                // System.out.println(i);
                continue;
            }
            System.out.println(i);
        }
    }
}