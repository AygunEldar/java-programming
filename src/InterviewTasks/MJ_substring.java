package InterviewTasks;

public class MJ_substring {

    //find all substring in a string
    //ABC
    //ABC /AB / BC /C /A /B /

    //012

    public static void main(String[] args) {
        printAllSubstring("ABCD");
    }

    public static void printAllSubstring(String str){

        String sub = "";
        for (int i = 0; i <str.length() ; i++) {

            for (int j = i + 1; j <= str.length(); j++) {
               // System.out.println(str.substring(i,j));
               sub = str.substring(i, j);
                System.out.println("sub = " + sub);
            }

        }
    }


}
