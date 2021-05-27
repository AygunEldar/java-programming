package day41bWithSaim;

public class SumNumbersInString {
    public static void main(String[] args) {

        System.out.println(getSumFromString("a5bc12def100g"));
    }


    public static int getSumFromString(String str) {

        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {//check if every character is digit

                 num +=""+ str.charAt(i);


                if (i == str.length()-1 ||!Character.isDigit(str.charAt(i + 1))) {

                    sum += Integer.parseInt(num);
                    num = "";// resets our String to the number
                }

            }
        }
                          return sum ;
    }

}

//        System.out.println(sumOfNums("a5bc12def100g"));
//                }
//public static int sumOfNums(String s){
//        int sum =0;
//        String num="";
//
//        for (int i = 0; i < s.length(); i++) {
//
//        if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
//        num += s.charAt(i);
//        if((s.charAt(i)>='0'&& s.charAt(i)<='9')&&(s.charAt(i+1)>='a'&& s.charAt(i+1)<='z')){
//        num +=" ";
//        }
//        }
//
//        }
//        String[] result= num.split(" ");
//        for (int i = 0; i <result.length ; i++) {
//        sum += Integer.parseInt(result[i]);
//        }
//        return sum;
//        }