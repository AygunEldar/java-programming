package again_again;

public class Class26_CountMatches {
    public static void main(String[] args) {

        String word ="java";
        char letter ='a';
        int count =0;

        for(int i= 0; i < word.length(); i++){
            if(word.charAt(i)==letter){
                count++;
            }
        }
        System.out.println("There are "+ count +" "+ letter+ " in " +word);
    }
}
