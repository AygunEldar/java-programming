package InterviewTasks;

public class ReverseWordsInSent {
    public static void main(String[] args) {

        String sent = "It is snowing in Chicago";

        String [] words =sent.split(" ");
        String reverse = " ";
        for(int i = 0 ;i < words.length;i++){

            String letters = words[i];
            String revWords =" ";
            for(int j = letters.length()-1; j >=0;j--){

               revWords += " "+letters.charAt(j);
            }
            reverse += revWords +" ";
        }
        System.out.println(reverse);
    }
}
