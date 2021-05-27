package InterviewTasks;

public class StringSameLetters {
    public static void main(String[] args) {
        System.out.println(same("abc", "cdr"));
       // System.out.println("*****BUG VAR ");
    }
    public static boolean same(String a,String b){
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if(a.charAt(i) == b.charAt(j)){
                    count++;
                }
            }
        }
        return(count == a.length());
    }
}


