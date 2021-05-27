package day21_string_manipuliation;

public class FirstAndLastTest {
    public static void main(String[] args) {

        String word = "MOM";
        char first = word.charAt(0);
        char last= word.charAt(2);

        if (first == last){
            System.out.println("first and last letter match");
        }else{
            System.out.println("first and last letters do not match");
        }


        System.out.println("****************************");
        if(word.charAt(0)==word.charAt(2)){
            System.out.println("first and last letter match");
        }else{
            System.out.println("first and last letters don not match");
        }


        String name = "level";
        char firstLetter = name.charAt(0);
        int count = name.length();
        char lastLetter= name.charAt(count-1);
        //char lastLetter = name.charAt(name.length()-1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);


        if(firstLetter==lastLetter){
            System.out.println(name+ " -first and last match");
        }else{
            System.out.println(name + "-first and last letter mismatch");
        }

    }
}
