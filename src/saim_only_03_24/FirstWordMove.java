package saim_only_03_24;

public class FirstWordMove {
    public static void main(String[] args) {

        String sentence = "Java is a fun language";
        String javaPlace = sentence.substring(0,sentence.indexOf(" "));
        String javaRePlace = sentence.substring(sentence.indexOf(" "));

        System.out.println(javaRePlace +" "+javaPlace);


    }
}
