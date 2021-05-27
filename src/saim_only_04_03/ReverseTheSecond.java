package saim_only_04_03;

public class ReverseTheSecond {
    public static void main (String [] args){

        String str = "I love java";
       String second = str.substring(str.indexOf(" ")+1,str.lastIndexOf(" "));
       String reverse =" ";

       for(int i= second.length()-1;i >=0; i--){
           reverse +=second.charAt(i);

       }
            System.out.println(str.replace(second,reverse));










//        String sentence = "I love java";
//           String part =""+ sentence.charAt(5) + sentence.charAt(4) + sentence.charAt(3)+ sentence.charAt(2);
//
//    String reverse = sentence.substring(0,2)+part+sentence.substring(6);
//                  System.out.println(reverse);









    }
}
