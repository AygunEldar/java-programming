package day11_comparison_operators;

public interface PrePostIncrementDecrementOp {
    public static void main(String [] args ){

        // PRE-INCREMENT
        int num1 =10; //10
        int num2 = ++num1; //1+10
        System.out.println("num1 = " +num1);
        System.out.println("num2 = " + num2);
        //post increment
        int num3 = 8;
        int num4 =num3++ ;
        System.out.println("num3 =" +num3);
        System.out.println("num4 =" +num4);

        int apples = 5;
        int basket = ++apples;
        System.out.println("Apples = " +apples);
        System.out.println("Baskets = " +apples);

        int kiwi =15;
        int kiwibask = kiwi++;
           kiwi+=1;
        System.out.println("Kiwi = " +kiwi);
        System.out.println("Kiwi in the basket = "+kiwibask);

        int cars = 5;
        System.out.println(++cars);

        int sedan = 10;
        System.out.println(sedan++);
        System.out.println(sedan);

        int a = 50;
        int b = 22;
        int c = a++ + b++;

        System.out.println("A =" +a);
        System.out.println("B = "+b);

        System.out.println("C = " +c);



    }
}
