package mine_mine_20;

public class ReverseUsingCharAt_2 {
    public static void main (String [] args){

     String word ="java";//noon
        System.out.println(""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));

  String reversed = (""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        System.out.println("reversed = " + reversed);

        if(word.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }
}
