package April;

public class StringNestedLoopDublicate {
    public static void main (String [] args){
        String str ="Hello world";
        for( int a = 0; a < str.length();a++){
            for(int b = 0; b <=a ;b++){
                System.out.print(str.charAt(b));
            }
            System.out.println();


        }


        for (int i = 0; i < str.length();i++){
            for(int j =i; j< str.length(); j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }

    }
}
