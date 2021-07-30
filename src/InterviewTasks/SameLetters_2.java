package InterviewTasks;

import java.util.Arrays;
import java.util.Locale;

public class SameLetters_2 {
    public static void main(String[] args) {

        System.out.println(isSameLetters("abc","cba"));

    }

    public static boolean isSameLetters(String a, String b) {

       // String [] word = a.split(" ");
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        String a2 = "";
        String b2 = "";

        for (int i = 0; i < a1.length; i++) {
            a2 += a1[i];
        }
        for (int j = 0; j < b1.length; j++) {
            b2 += b1[j];

        }


                return a2.equals(b2);
            }

        }







