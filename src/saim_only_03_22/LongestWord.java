package saim_only_03_22;

public class LongestWord {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "course";
        String word3 = "teacher";
        String biggestWordWithE="";

        String result = word1.length() >word2.length() ? word1 : word2;
        System.out.println(result);
    }
}
