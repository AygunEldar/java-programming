package April;

public class Char_Array_07 {
    public static void main(String[] args) {
        char[] letters ={'B','a','k','u',' ','i','s',' ','t','h','e',' ',
                'c','a','p','i','t','a','l',' ','o','f',' ','A','z','e','r','b','a','i','j','a','n'};

        // variant # 1
        for(char each : letters){
            System.out.print(each+ "  ");
        }


        String sentence = new String (letters); // variant # 2
        System.out.println("\n"+sentence);

        String voc = "spelling";
        char[] phonem =voc.toCharArray();
        System.out.println(phonem);
    }
}
