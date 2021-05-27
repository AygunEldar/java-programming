package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {



        String total = "345";
        int count = Integer.parseInt(total);
        int num = Integer.parseInt(total);
        System.out.println("num = " + num);

        String strPrice = "123.99";

        double price = Double.parseDouble(strPrice);
        if(price > 100){
            System.out.println("expensive");

        }


          // - 100 -
        String sentence ="I wrote 100 lines of Java code";
        //split by space , parse index 2 to int

        String [] sentenceArr =sentence.split(" ");
        int linesOfCode= Integer.parseInt(sentenceArr[2]);
        System.out.println(linesOfCode);



    }
}
