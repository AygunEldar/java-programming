package interviewTasks_Saim;

public class ReverseSentence {
    public static void main(String[] args) {
        reverseSentence("The sun is shining");
    }
    public static void reverseSentence(String str){

        String [] words = str.split(" ");//space meaning
        for (int i = words.length- 1; i >=0 ; i--) {

            System.out.print(words[i] + " ");
        }
    }
}
