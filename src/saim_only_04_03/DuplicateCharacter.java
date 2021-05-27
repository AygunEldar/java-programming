package saim_only_04_03;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String word = "AAABCCDEEF";
        //String letter = "";
        String same = "";
        for (int i = 0; i < word.length(); i++) {

            if(word.indexOf(word.charAt(i))!=word.lastIndexOf(word.charAt(i))
                    && !same.contains(word.charAt(i)+"")) {
                same += word.charAt(i);
            }
        }
        System.out.println(same);
    }
        }
