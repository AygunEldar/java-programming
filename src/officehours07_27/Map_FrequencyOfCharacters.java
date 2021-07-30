package officehours07_27;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_FrequencyOfCharacters {
    /** Create a method that will accept a String and print out the frequency of every character in the String

     Hint: use maps to keep track of the frequency. Go through the String using only one loop

     Ex:
     Input: "apple"
     Output: a = 1
     p = 2
     l = 1
     e = 1
Algorithm
     traverse (travel across or through) string element

     */
    public  static void FrequencyOfChars(String str){

//if I want to keep the insertion order I use LinkHashMap
       // Map<Character, Integer> map = new LinkedHashMap<>();


       // Map<Character, Integer> map = new HashMap<>(); //it gives unordered way

        Map<Character, Integer> map = new TreeMap<>(); //sorted ABC order

        for(Character each: str.toCharArray()){

            if(map.containsKey(each)){

                map.put(each,map.get(each)+1);

            }else{

                 map.put(each,1);
            }
        }
        System.out.println(map);

    }

    //Version 2
    public static void eachCharFrequency(String word){

        Map<Character,Integer>letters = new TreeMap<>();

        for (int i = 0; i < word.length(); i++) {

            char key = word.charAt(i);

            if(!letters.containsKey(key)){

                letters.put(key,0);

            }
            letters.put(key,letters.get(key) + 1);
        }
        System.out.println(letters);
    }

    public static void main(String[] args) {
        FrequencyOfChars("apple");
        eachCharFrequency("strawberry");
    }
}
