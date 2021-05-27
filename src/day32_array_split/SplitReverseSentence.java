package day32_array_split;

public class SplitReverseSentence {
    public static void main(String[] args) {


        String word = "java is today";

        String []word1 =word.split(" ");
        String reverse="";

        for(int i =word1.length-1; i >= 0; i--){

          //  System.out.print(word1[i]+" ");
            reverse += word1[i]+" ";
        }
        System.out.println("sentence is - "+ word);
        System.out.println("Reversed sentece is -"+ reverse.trim());
    }
}
