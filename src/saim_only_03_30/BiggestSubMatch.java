package saim_only_03_30;

public class BiggestSubMatch {
    public static void main (String [] args ){

        String word ="aaabbbcccccddddee";
        int n =word.length();
        int max = 0;
        char letter = word.charAt(0);
        int count =1;

        for(int i= 0; i < n; i++){
            if( i < n-1 && word.charAt(i)==word.charAt(i+1)) {
                count++;
            }else {
                if(count > max){
                 max =count;
                 letter =word.charAt(i);
                }
                count =1;
            }

        }
        System.out.println(word.substring(word.indexOf(letter),word.lastIndexOf(letter+1)));


    }
}
