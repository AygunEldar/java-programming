package practiceWith_MJ;

public class AssignPract1 {
    public static void main(String[] args) {

        String num = String.valueOf(2.5);// num =2.5
        int num1 =2;
        num += num1;//"2.5"+2=2.52

        float num2 = Float.parseFloat(num);//2.52
        System.out.println(num2);//
        System.out.println(a(num2));


    }
public static int a(int a){
        return 1;
}
public static int a(double a){//(2.52)
        return 2;                       //2
}
public static int a (String a){
        return 3;
}
}
