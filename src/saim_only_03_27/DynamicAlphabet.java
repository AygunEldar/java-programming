package saim_only_03_27;

import java.util.*;

public class DynamicAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Uppercase or Lowercase:");
        String choice = scan.next();
        System.out.println("Ascending or descending");
        String order = scan.next();
        char letter = 'A';
        if (choice.equalsIgnoreCase("UpperCase")) {
            if (order.equalsIgnoreCase("Ascending")) {
                letter = 'A';
                while (letter >= 'A' && letter <= 'Z') {
                    System.out.print(letter + " ");
                    letter++;
                }
            } else {
                letter = 'Z';
                while (letter <= 'Z' && letter >= 'A') {
                    System.out.print(letter + " ");
                    letter--;
                }
            }
        } else if (choice.equalsIgnoreCase("LowerCase")) {
            if (order.equalsIgnoreCase("Ascending")) {
                letter = 'a';
                while (letter >= 'a' && letter <= 'z') {
                    System.out.print(letter + " ");
                    letter++;
                }
            } else {
                letter = 'z';
                while (letter <= 'z' && letter >= 'a') {
                    System.out.print(letter + " ");
                    letter--;
                }
            }


        }
    }
}