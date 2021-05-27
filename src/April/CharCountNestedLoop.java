package April;

public class CharCountNestedLoop {
    public static void main (String [] args){

        String word = "java";
       // int count =0;
        for( int a = 0; a < word.length();a++){
            System.out.println("outer " + word.charAt(a));
           int count =0;
            for(int b = 0; b < word.length(); b++){
               // System.out.println();
                    if(word.charAt(a) == word.charAt(b)){
                        count++;
            }
            }
            System.out.println(word.charAt(a) + " = "+count);
        }

    }
}
