package InterviewTasks;

import again_again.reverse;

public class ReverseWord {
    public static void main(String[] args) {

                   // I version
        System.out.println(reverse("Washington"));

    }

    public static String reverse(String str) {
        String result = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }
}

                    // version II
    class ReverseWord2{

    public static void main(String[] args) {
        System.out.println(reversSingleWord("State"));

    }
    public static String reversSingleWord(String str){
        String reverse = new StringBuilder(str).reverse().toString();
        return reverse;
    }

}

