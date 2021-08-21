package interviewTasks_Saim_Strings;

import java.util.ArrayList;

public class LongestPalindrome {
    public static void main (String [] args){

        System.out.println(findLongestPalin("civic"));

    }

    public static  String findLongestPalin(String  words){

        String longest = "";

       ArrayList<String> list = new ArrayList<>();

        for(int i =0; i < words.length(); i++ ){

            for(int j = i+1; j < words.length(); j++){
                list.add(words.substring(i,j));
            }

        }

        for(String each : list){
            String reverse = "";
            for(int i  =each.length()-1; i >= 0; i --){
                reverse += each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse) && each.length() > longest.length()){
                longest = each;
            }

        }
        return longest;
    }

}
