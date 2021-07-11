package InterviewTasks;

public class RemoveDublic {

    public static void main(String[] args) {
        System.out.println(remove("AABBCD"));
    }
    public static String remove(String str){

          String result="";

        for (int i = 0; i < str.length() ; i++) {
         if(!result.contains(str.charAt(i)+"")){
              result += str.charAt(i);
   }

        }
        return result;
    }
}
