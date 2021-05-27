package day27_for_loop_examples;

public class IndexOf {
    public static void main(String[] args) {


        String word =" githgb";
        char letter = 'l';
        int index = -1;

        for(int n = 0; n <word.length(); n++){
           // System.out.println(n+ " - "+word.charAt(n) );
            if (word.charAt(n)== letter){
             index = n ;
                System.out.println(letter +" is found at index " + index);
                break;// exit for loop//  and  find for the first one then exit
            }
        }
        if (index ==-1){
            System.out.println(letter+" is not present");
        }else{
            System.out.println(letter +" is found at index " + index);
        }
    }
}
