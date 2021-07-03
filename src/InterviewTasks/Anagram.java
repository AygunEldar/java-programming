package InterviewTasks;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("listen","silent"));
    }

    public static boolean isAnagram(String a, String b){

        if(a.length() != b.length()){

            return false;
        }

       int [] count = new int[26];

        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < b.length(); i++) {


            char aLetters = a.charAt(i);
            char bLetters = b.charAt(i);

            count[aLetters -97] = count[aLetters -97] +1;
            count[bLetters -97] = count[bLetters -97] -1;

        }

        return true;
    }

}
