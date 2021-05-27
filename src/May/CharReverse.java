package May;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CharReverse {
    public static void main(String[] args) {

        String name ="Cybertek";
        System.out.println(name);
        String [] charsL =name.split("");
        List<String>revLetters = Arrays.asList(charsL);

        Collections.reverse(revLetters);
        System.out.println(revLetters + "reversed");

        Collections.sort(revLetters);
        System.out.println( revLetters+ " sorted");

    }
}
