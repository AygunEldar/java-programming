package officehours05_10;

import java.util.ArrayList;

public class IQ_SeparateParts {
//[Separate parts]
//
//    Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
//
//    Ex: str = "ABCD123$%#@&456EFG!"
//    list1: {$, %, #, @, &, !}
//    list2: {A, B, C, D, E, F, G}
//    list3: {1, 2, 3, 4, 5, 6}
//
//    Challenge: make a method that will do this action and it will return an ArrayList which holds all 3 of the other ArrayLists
//    Challenge 2: do the original task again, but without a loop. Use lambda

    public static void main(String[] args) {

        ArrayList<ArrayList<Character>> all =new ArrayList<>();//[letters],[digit],[specials]

        String str ="ABCD123$%#@&456EFG!";
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digit = new ArrayList<>();
        ArrayList<Character> specials = new ArrayList<>();

        for(int i = 0; i< str.length(); i++){

            char eachChar = str.charAt(i);

            if(Character.isLetter(eachChar)){
                letters.add(eachChar);

            }else if(Character.isDigit(eachChar)){
                digit.add(eachChar);

            }else{
                specials.add(eachChar);

            }
            System.out.println("letters = "+letters);
            System.out.println("digits = "+digit);
            System.out.println("specials = "+specials);
        }
    }
                      // additional
public static ArrayList<ArrayList<Character>> separateParts(String str){

        int a = 45;
        ArrayList<ArrayList<Character>> all = new ArrayList<>();//[letters],[digit],[specials]


    ArrayList<Character> letters = new ArrayList<>();
    ArrayList<Character> digit = new ArrayList<>();
    ArrayList<Character> specials = new ArrayList<>();

    all.add(letters);
    all.add(digit);
    all.add(specials);

//    all.add(new ArrayList<>());
//    all.add(new ArrayList<>());
//    all.add(new ArrayList<>());

    for(int i = 0; i< str.length(); i++){

        char eachChar = str.charAt(i);

        if(Character.isLetter(eachChar)){
            all.get(0).add(eachChar);

        }else if(Character.isDigit(eachChar)){
            all.get(1).add(eachChar);

        }else{
            all.get(2).add(eachChar);

        }
        System.out.println("letters = "+letters);
        System.out.println("digits = "+digit);
        System.out.println("specials = "+specials);
    }


      return all;
}
}
