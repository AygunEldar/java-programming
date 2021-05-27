package repls04;
import java.util.*;

public class SplitSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String [] sentenceNew = sentence.split(" ");
      for(String each : sentenceNew){
          System.out.println(each);
      }
    }
}
