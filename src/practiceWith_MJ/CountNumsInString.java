package practiceWith_MJ;

public class CountNumsInString {
    public static void main(String [] args) {
        System.out.println(getSumFromString("5ki8fgd9cvb4vc"));
    }
    public static int getSumFromString(String str) {
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {//check if every character is digit

                num += str.charAt(i);

                if (i == str.length()-1 ||!Character.isDigit(str.charAt(i + 1))) {

                    sum += Integer.parseInt(num);
                    num = "";// resets our String to the number
                }

            }
        }
        return sum;
    }

}



