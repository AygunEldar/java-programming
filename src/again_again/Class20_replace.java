package again_again;

public class Class20_replace {
    public static void main(String [] args){
        String word = "java";

        System.out.println(word.replace("a","u"));
        System.out.println(word.replace("j","d"));


        String sentence ="java strings are fun";
        System.out.println(sentence.replace("java","selenium"));
        System.out.println(sentence.replace("strings","conditions"));
        System.out.println(sentence.replace("java"," "));
    }
}
