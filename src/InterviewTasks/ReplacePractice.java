package InterviewTasks;

public class ReplacePractice {

    public static void main(String[] args) {


        String word1 ="tomorrow";
        System.out.println(replace_o());
    }

    public static  String replace_o(){

        String str = "$";
        String word = "tomorrow";
        String result ="";

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'o'){
                result += word.charAt(i-1)+str;
                str +="$";
            }
        }
        return result;
    }
}
