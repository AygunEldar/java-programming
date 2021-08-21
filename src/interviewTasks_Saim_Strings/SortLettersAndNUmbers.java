package interviewTasks_Saim_Strings;

import java.util.Arrays;

public class SortLettersAndNUmbers {
    public static void main(String[] args) {
        System.out.println(sortLettersNumbers("JYT58DS91CVB1632RDF"));
    }
    public static String sortLettersNumbers(String str){

        String temp = "";

        for (int i = 0; i <str.length() ; i++) {
            temp += str.charAt(i) +" ";
            if(Character.isLetter(str.charAt(i))&& i < str.length()-1){
                if(Character.isDigit(str.charAt(i)+1)){
                    temp += ",";
                }
            }
            if(Character.isDigit(str.charAt(i)) && i < str.length()-1){
                if(Character.isLetter(str.length()+1)){
                    temp +=",";
                }
            }
        }
        String [] arr = temp.split(",");
        str="";
        for(String each : arr){
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            for(char eachChar : chars){
                str += eachChar+ "";
            }
        }
        return str;
    }

}
