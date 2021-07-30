package july;

public class ExampleIfEqualString {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "java";
        String word = "Java";
        String word3 = new String("Java");
        String word4 = new String("Java");
        String word5 = new String("java");

//        System.out.println(word1==word2);//true
//        System.out.println(word1.equals(word2)); //true
//
//        System.out.println(word==word1);//false
//
//        System.out.println(word4==word3);//false
//        System.out.println(word4.equals(word3));//true
//
//        System.out.println(word1==word3);
 // System.out.println(word.equals(word3)) ;//true
 //0 System.out.println(word==word3) ;//false
//        ;
//        System.out.println(word2==word4);
//        System.out.println(word2.equals(word4));

        System.out.println(word1.equals(word5));//true
        System.out.println(word1==word5);//false

    }
}
