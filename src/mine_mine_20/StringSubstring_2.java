package mine_mine_20;

public class StringSubstring_2 {
    public static void main (String [] args){

 String word ="java is fun";

 System.out.println(word.indexOf("i"));

  int letter = word.indexOf("i");
        System.out.println(word.substring(word.indexOf("i")+1));



       String exam = "Java is [always] fun";

       int start =exam.indexOf("[");
        int end =exam.indexOf("]");

        System.out.println(exam.substring(start+1,end));
        System.out.println(exam.substring(exam.indexOf("[")+1,exam.indexOf("]")));

    }
}
