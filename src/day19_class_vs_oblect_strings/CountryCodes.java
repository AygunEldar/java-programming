package day19_class_vs_oblect_strings;

public class CountryCodes {
    public static void main(String[] args) {


        String countryCode = "KG";
        if (countryCode.equals(countryCode.toUpperCase())){
            System.out.println("Pass -country code = " + countryCode);;
        }else{
            System.out.println(" Fail -It is not the country code  " + countryCode);
        }


        System.out.println("******************************");


        String word = "Java";
        String uWord = word.toUpperCase();
        System.out.println(word);
        System.out.println("uWord = " + uWord);

        if(word.equals(uWord)){
            System.out.println(word);
        }else{
            System.out.println(uWord);
        }
    
        
    }
}
