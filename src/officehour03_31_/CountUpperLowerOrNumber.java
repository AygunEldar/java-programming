package officehour03_31_;

public class CountUpperLowerOrNumber {
    public static void main (String [] args) {
//        Count upper, lower, and numbers
//        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
//                Ex:
//        Input: 2juMp41EEkd4s4 Output:
//        3 uppercase letters
//        6 lowercase letters
//        5 numbers

        String str = "2juMp41EEkd4s4";
       int upper=0,lower=0, number=0;

       for(int i=0; i<str.length(); i++) {
           char eachletter = str.charAt(i);
           if (eachletter >='A' && eachletter <='Z'){
               upper++;
           }else if (eachletter >= 'a' && eachletter <= 'z') {
               lower++;
           }else if(eachletter >= '0' && eachletter <='9'){
                number++;
           }

       }
        System.out.println("Uppercase = " +upper);
        System.out.println("lowercase = " +lower);
        System.out.println("number = " + number);
    }
}
