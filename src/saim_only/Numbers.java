package saim_only;

public class Numbers {
    public static void main (String [] args){
        int num1 = 14;
        int num2 = 26;
        int num3 = 18;
        if ( num1 < num2 && num2 > num3){
            System.out.println("Numbers are not equal");
        }else if (num3 < num1 && num2 > num3){
            System.out.println(num2 +" is greatest among them");
        }
        }
}
