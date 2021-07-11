package july.elgun;

public class SubString {
    public static void main(String[] args) {

        String str ="java";
        subStringOwn(str,2);
        subStringOwn(str, 1,3);
    }
    public static void subStringOwn(String str,int index){

      String result ="";

        for (int i = 0; i < index; i++) {
            result += str.charAt(i) ;

        }
        System.out.println(result);
    }
    public static void subStringOwn(String str, int startIndex, int endIndex){

        String result ="";
       int temp = startIndex;
        for (int i = 0; i < endIndex - startIndex ; i++) {
            result += str.charAt(temp) ;
   temp++;
        }
        System.out.println(result);
    }

}
