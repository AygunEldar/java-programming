package InterviewTasks;

public class Remove_dub {
    public static void main(String[] args) {
        System.out.println(removeDublic("AABBCCDFG"));
    }

    public static  String removeDublic(String str){

       String result =  "";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(str.charAt(i)+"")){
                 result += str.charAt(i);
            }
        }
        return  result;
        }

}
