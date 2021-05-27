package saim_only_03_22;

public class ThreeWords {
    public static void main(String[] args ){

        String word1 ="interesting";
        String word2 ="amazing";
        String word3 ="electronic";
        String biggestWordWithE ="";

        if(word1.contains("e") && word1.length()>biggestWordWithE.length()){
            biggestWordWithE = word1;

        }
        if (word2.contains("e") && word2.length() >biggestWordWithE.length()){
            biggestWordWithE =word2;

        }
        if(word3.contains("e") && word3.length() >biggestWordWithE.length()){
            biggestWordWithE =word3;
        }
         if(biggestWordWithE.isEmpty()){
             System.out.println("None of them is contain e");
         }else{
             System.out.println("The longest word with e is " +biggestWordWithE);
         }



    }
}
