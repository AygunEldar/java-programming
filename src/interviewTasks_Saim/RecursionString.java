package interviewTasks_Saim;

public class RecursionString {
    public static void main(String[] args) {
        permutationString("ABC");
    }
      public static void permutationString(String word){

        permutationString("",word);
    }
    private static void permutationString(String perm, String word){
        if(word.length()==0){
            System.out.println(perm);
        }else{
            for (int i = 0; i < word.length(); i++) {
                permutationString(perm+word.charAt(i),
                        word.substring(0,i)+word.substring(i+1,word.length()));
            }

        }
    }
}
