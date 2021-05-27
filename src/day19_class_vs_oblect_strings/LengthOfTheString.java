package day19_class_vs_oblect_strings;

public class LengthOfTheString {
    public static void main(String[] args) {
        String firstName = "Aygun";
        System.out.println(firstName.length());//5
        System.out.println( firstName +"-" +firstName.length());
        int count =firstName.length();
        System.out.println("count = " + count);


        System.out.println("************************************************");

        String word = "java";
        System.out.println(word);
        System.out.println(word.length() + "characters");
        System.out.println("count: " +word.length());
        System.out.println("wooden spoon".length());


        System.out.println("**************************************************");

        String password = "abc123";
       //** IF STATEMENT:


    if (password.length() >= 6){
        System.out.println("Valid amazon password");
    }else{
        System.out.println("Invalid");
    }
    String country = "Azerbaijan";
        System.out.println("Azerbaijan consists of "+country.length() + " character");
        System.out.println(country.toUpperCase());
    }
}
