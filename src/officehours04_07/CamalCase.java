package officehours04_07;

public class CamalCase {
    public static void main (String [] args){

        String str = "thisHasManyWordsToFind";
        int words =1;
        for(int i =0; i < str.length(); i++){

            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                  words++;
            }
        }

    System.out.println("There are "+ words +" uppercases in the statement");
    }
}


