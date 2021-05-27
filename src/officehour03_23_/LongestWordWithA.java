package officehour03_23_;

public class LongestWordWithA {
    public static void main (String [] args ){


        String word1 = "java";
        String word2 = "school";
        String word3 = "application";
        String biggestWordWithA ="";//java

        if(word1.contains("a") && word1.length() > biggestWordWithA.length()){
            biggestWordWithA = word1;
        }
        if(word2.contains("a") && word2.length() > biggestWordWithA.length()){
            biggestWordWithA = word2;
        }
        if(word3.contains("a") && word3.length() > biggestWordWithA.length()){
            biggestWordWithA = word3;
        }
        System.out.println("the longest word with a " + biggestWordWithA);

      if(biggestWordWithA.isEmpty()){
          System.out.println("No words contained A");
      }else{
          System.out.println("longest word with A: " +biggestWordWithA);
      }




    }
}
