package again_again;

public class Class21_stringmanipilation {
    public static void main(String[] args) {

        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab").toUpperCase());
        word = word.replace("hub","lab");

        System.out.println("word = " + word.toUpperCase());

        System.out.println(word.replace("i","o").replace("a","i"));

    }
}
