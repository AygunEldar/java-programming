package again_again;

public class Class27_IndexOf {
    public static void main (String [] args){
        String word = "gitghub";
        char letter ='g';
        int idx = -1;

        for(int i = 0; i < word.length();i++){
            if(word.charAt(i)==letter) {
                idx = i;
                System.out.println(letter + " is found at index " + idx);
                break;
            }
        }
        if(idx == -1){
            System.out.println("could not find");
        }else{
            System.out.println(letter + " is found at index " + idx);
        }
    }
}
