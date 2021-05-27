package April;

public class ChooseUpperCase {
    public static void main (String [] args ){

        String str ="dfdGHbkTYFHGVdlsRVkBHfj";
         int count =1;

         for (int i = 1; i < str.length(); i++){
             char letter =str.charAt(i);
             if(letter >= 'A' && letter <= 'Z'){
                 count ++;
             }
         }
        System.out.println("There are "+count+ " uppercases");


    }

}
