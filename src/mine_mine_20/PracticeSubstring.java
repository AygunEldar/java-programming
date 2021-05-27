package mine_mine_20;

public class PracticeSubstring {
    public static void main (String[] args){

        String word = "Code is: 456789";
        System.out.println(word.indexOf(":"));
        int numOfIndex = word.indexOf(":");
                System.out.println(word.substring(word.indexOf(":")+1));
                System.out.println(word.charAt(word.length()-1));

                String today = "i coded [husky]today";
               int beginning = today.indexOf("[");
               int ending = today.indexOf("]");
               System.out.println(today.substring(beginning+1,ending));

                System.out.println(today.substring(today.indexOf("[")+1, today.indexOf("]")));

    }


}
