package officehours04_13;

public class MultipleWords {
    public static void main(String[] args) {
        String words ="knife, wooden spoon, plates, cups, " +
                "forks, pan, pot, trash can, fridge, dish washer";

        String []arrWords = words.split(", ");
        for(String eachWord : arrWords) {
            if (eachWord.contains(" ")) {
                System.out.println(eachWord);
            }

        }




    }
}
