package officehour03_29_;

public class MiddleChar {
    public static void main(String[] args) {
        String word = "apple";
        if (word.length() %2 ==1){
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2,word.length()/2+1));
        }else{
            int part = word.length()/2;//-- if we repeat it then  name it
            System.out.println(word.charAt(part-1) + "" +word.charAt(part));
            System.out.println(word.substring(part-1,part+1));
        }

    }
}
