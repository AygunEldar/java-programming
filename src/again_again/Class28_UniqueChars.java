package again_again;

public class Class28_UniqueChars {
    public static void main (String [] args ) {

        String word = "javva";
        String unique="";

        for(int i = 0; i < word.length(); i++){
           // System.out.println(word.charAt(i));
            if(!unique.contains(word.charAt(i)+"")){
                unique += word.charAt(i);
            }
        }
        System.out.println(unique);
    }
}
