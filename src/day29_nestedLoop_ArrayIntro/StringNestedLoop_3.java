package day29_nestedLoop_ArrayIntro;

public class StringNestedLoop_3 {
    public static void main (String []args){
        String word = "hello word";

        for (int i =0; i < word.length(); i++) {
            for (int k = 0; k <= i; k++){

                System.out.print(word.charAt(k));
            }
            System.out.println();
        }


        String word1 = "java";

        for (int i =0; i < word1.length(); i++) {
            for (int j =i; j <word1.length(); j++){

                System.out.print(word1.charAt(j));
            }
            System.out.println();
        }




    }
}
