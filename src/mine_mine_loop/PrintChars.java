package mine_mine_loop;

public class PrintChars {
    public static void main (String [] args){

        String word = "python";

        for(int i =0;i< word.length();i++){

            System.out.println(word.charAt(i));
        }

        System.out.println("**********REVERSE**************");

        for(int i =word.length()-1 ;i>= 0;i--){

            System.out.println(word.charAt(i));
        }
        System.out.println("-------REVERSE 2--------");
        word ="program";
        for(int j= word.length()-1; j>=0; j--) {
            System.out.println(word.charAt(j));
        }
    }
}
