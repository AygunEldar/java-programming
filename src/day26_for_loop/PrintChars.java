package day26_for_loop;

public class PrintChars {
    public static void main(String[] args) {

        String word ="python";
        System.out.println(word.length());
       // char i =word.charAt(0);
        for(int i=0;i < word.length(); i++){
            System.out.println(word.charAt(i));
        }

        System.out.println("*************************");

        word = "java";
       for(int  i = word.length()-1; i>=0; i--){
           System.out.println(word.charAt(i));

       }



    }
}
