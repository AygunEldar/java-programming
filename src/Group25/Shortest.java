package Group25;

public class Shortest {
    public static void main(String[] args) {

        String [] words = {"apple","banana","pear","car","me"};
        String  shortestWord =words[0];
        for(int n = 0; n < words.length;n++){
            if(words[n].length()< shortestWord.length()){
                shortestWord =words[n];
            }
        }
        System.out.println(shortestWord);
    }
}
