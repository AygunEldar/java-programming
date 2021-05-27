package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {


        System.out.println(Integer.max(10,5));
        System.out.println(Integer.max(5,10));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println("Min INT: "+Integer.MIN_VALUE);
        System.out.println("MAX INT: " +Integer.MAX_VALUE);

        System.out.println(Double.max(224.3,23.9));
        System.out.println("MIN DOUBLE: " +Double.MIN_VALUE);
        System.out.println("MAX DOUBLE : "+ Double.MAX_VALUE);

        System.out.println(Double.compare(1,5));//   -1   - first one smaller
        System.out.println(Double.compare(5,5));// 0     -both equal
        System.out.println(Double.compare(5,1));// 1     -first lager


        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));


        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("It is uppercase");
        }

             String word = "JaVA iS FuN";


        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){  //isLowerCase
                System.out.print(word.charAt(i));

            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);


        System.out.println(Boolean.TRUE);





    }

}

