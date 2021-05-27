package officehours04_06;

public class BiggestSubstring {
    public static void main (String [] args ){

        String str ="aaabbbcccccdddee";
        String longestSub = "";
        String temp = "";
        for(int i =0; i < str.length()-1; i++){
            temp += str.charAt(i);

            if(str.charAt(i) != str.charAt(i+1)){
                if (temp.length() > longestSub.length()){
                    longestSub = temp;
                }
                  temp = "";
            }
        }
        System.out.println("The longest substring - " +longestSub);
    }


}
