package InterviewTasks;
import java.util.*;

public class StringFreqOfCharac {
    public static void main(String[] args) {

        System.out.print(frequencyOfChars("AAAABBCCCD"));
    }
    public static String frequencyOfChars(String str) {
       // str = "AAABBCDD";
        int [] freq= new int [str.length()];
        int i =0;
        char letter[] =str.toCharArray();
        for(i= 0; i< str.length();i++){
            freq[i]=1;
            for(int j= i+1; j< str.length();j++){
                if(letter[i]==letter[j]){
                    freq[i]++;
                    letter[j]='0';
                }
            }
        }
    for(i=0;i < freq.length;i++){
        if(letter[i]  !=' ' && letter[i]!='0'){
            System.out.print(freq[i]+""+letter[i]);
            System.out.println();
        }
    }
    return str;
    }
}
