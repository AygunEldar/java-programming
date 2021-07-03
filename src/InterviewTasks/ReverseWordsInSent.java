package InterviewTasks;

public class ReverseWordsInSent {
    public static void main(String[] args) {

        System.out.println(reverseWordsInASentence("It is snowing in Chicago"));

            }
            public static  String  reverseWordsInASentence (String str) {

                String[] words = str.split("");
                String result = "";
                for (int i = 0; i < str.length(); i++) {
                    String letters = words[i];
                    String reverseWords = " ";

                    for (int j = letters.length()-1; j >= 0; j--) {

                        reverseWords += "" + letters.charAt(j);
                        result += reverseWords + " ";
                    }

                }
                    return result;
            }
}
