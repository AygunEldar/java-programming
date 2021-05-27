package saim_only_04_03;

public class CamelCase {
    public static void main (String []args){

        String str = "thisHasManyWordsToFind";
        
        int countUpper =1;
        for( int i =0 ; i < str.length(); i++){
            char letter = str.charAt(i);
            if(letter >= 'A' && letter <= 'Z'){
                countUpper++;

            }
        }
        System.out.println(countUpper);
    }

}
