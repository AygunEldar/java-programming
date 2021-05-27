package day20_string_manipulation;

public class Replace {
    public static void main(String[] args) {


        String word =" java";
        System.out.println(word.replace("a","u"));
        String sentence = " java strings are fun";
        System.out.println(sentence.replace("strings are "," programming is "));
        System.out.println(sentence.replace("string","condition"));
        System.out.println(sentence.replace("java",""));

    }
}
