package again_again;

public class Class27_Neighbors {
    public static void main (String [] args ){

        String word = "jaavvaaspppoon";

        for(int pair = 0; pair < word.length()-1;pair++){
            System.out.print(word.charAt(pair));
            System.out.println(word.charAt(pair+1));
                    if(word.charAt(pair)==word.charAt(pair+1)){
                        System.out.println("beep -"+ word.charAt(pair));
                    }
        }

    }
}
