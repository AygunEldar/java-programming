package day38_methods;

public class IQ_1_100Without_Loop {
    public static void main(String[] args) {
        printNum(1);


    }
    //1.main method
    //2.custom method
    public static void printNum( int num) {
        System.out.print(num + " ");
        num++;
        if (num <= 100) {
            printNum(num);
        }

    }
}
