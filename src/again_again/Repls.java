package again_again;
import java.util.*;

public class Repls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int javaCount = 0;
        int pythonCount = 0;
        for (int i = 0; i < sentence.length() - 4;i++) {
            if (sentence.substring(i, i + 4) == ("java")) {
                javaCount++;

            }
        }
        for (int j = 0; j < sentence.length() - 6;j++) {
            if (sentence.substring(j, j + 6) == ("python")) {
                pythonCount++;
            }

        }
        System.out.println(javaCount==pythonCount);
    }
}