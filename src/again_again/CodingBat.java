package again_again;

import java.util.*;

public class CodingBat {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            int num = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    num++;
                }

            }
            if (num == 2) {
                System.out.print(i + " ; ");
            }

        }
    }
}