package saim_only_03_20;

public class CharacterChecker {
    public static void main (String [] args ){
        char letter = 'G';


     if (letter >= 65 && letter <= 90){ //if (letter >= 'A' && letter <= 'Z')
         System.out.println("It is upper case");
     }else if(letter >= 97 && letter <= 122){ // }else if(letter >= 'a' && letter <= 'z){
         System.out.println("It is lower case");
     }else{
         System.out.println("It is not a letter");
     }




    }
}
