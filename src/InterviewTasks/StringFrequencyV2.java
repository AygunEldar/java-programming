package InterviewTasks;
import java.util.*;

public class StringFrequencyV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the letters");
        String letters = scan.next();
        System.out.println(freqLetters("AAABBCDDDD"));
    }
    public static String freqLetters (String str){
        int freq = 0;
        String result  ="";
        String alph ="";
        for(char i = 'A' ; i <= 'Z'; i ++)
        {
            freq++;
            if (alph.contains(i + "")) {
                continue;
            }
            for (int n = 0; n < str.length(); n++) {
                if (str.charAt(n) == i) {
                    freq++;
                }
            }
            if (freq > 0) {
                result += freq + "" + i + "";
                alph += i;
            }
        }
        return result;
    }
}
