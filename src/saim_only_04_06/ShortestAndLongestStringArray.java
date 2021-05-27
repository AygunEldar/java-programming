package saim_only_04_06;
import java.util.*;

public class ShortestAndLongestStringArray {
    public static void main(String[] args) {
 Scanner scan =new Scanner (System.in);
        System.out.println("Enter some words");
        String [] words = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};

           String shortest =words[0];
           String longest = words[0];
        for(int i=0; i < words.length;i++ ){
            if(longest.length() < words[i].length()){
                longest = words[i];

            }
            if(shortest.length() > words[i].length()){
                shortest = words[i];
            }

        }
        System.out.println("Longest word is "+longest);
        System.out.println("Shortest word is " + shortest );







    }
}
