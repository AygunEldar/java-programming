package April;
import java.util.*;

public class Repls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String[] words = new String [str.length()];
        words = str.split(", ");
        String shortest = words[0];
        for(int i =0; i< words.length;i++){
            if(words[i].length() < shortest.length()){
                shortest =words[i];

            }
        }
        String allShortest ="";
     for(String each : words){
         if(each.length() == shortest.length()){
            shortest = each;
             allShortest += shortest +",";


         }
     }
        allShortest=allShortest.substring(0,allShortest.length()-1);
     // String [] shortestArr = new String [allShortest.length()];
     //    shortestArr = allShortest.split(",");
         String []shortestArr =allShortest.split(",");


        Arrays.sort(shortestArr);
        System.out.println(Arrays.toString(shortestArr));


    }
}