package july;

public class WithHalida {

    public static void main(String args[]) {

        String word = "javva";
        String unique = "";

        //char [] letters =school.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
               // count=0;
                if (word.charAt(i) == word.charAt(j)) {
                    count++;

                }

            }
            if (count == 1) {
                unique+= word.charAt(i) ;
            }

           //System.out.println(unique);// letter by letter
        }
        System.out.println(unique);
    }
}
