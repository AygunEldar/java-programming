package May;

public class SentenceRev {
    public static void main(String[] args) {

        String str = "I love Java. I enjoy Coding";
        String[] sentences = str.split(" ");
        String reverse = "";

        for (int i = 0; i < sentences.length; i++) {
            String words = sentences[i];
            String revSentences = "";

            for (int j = words.length() - 1; j >= 0; j--) {
                revSentences = revSentences + words.charAt(j);
            }
            reverse = reverse + revSentences + " ";

        }
            System.out.println(reverse);


    }



}
