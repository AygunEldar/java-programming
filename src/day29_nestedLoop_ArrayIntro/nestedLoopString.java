package day29_nestedLoop_ArrayIntro;

public class nestedLoopString {
    public static void main (String [] args ){

        String country = "Azerbaijan";
        for (int i =0; i < country.length();i++){
            for(int k =0; k <= i; k++){
                System.out.print(country.charAt(k));
            }
            System.out.println();
        }
    }
}
