package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
 StaticBlockDemo st1 = new StaticBlockDemo();//static (10) -->constructor(10+5)

       StaticBlockDemo st2 = new StaticBlockDemo();//only constructor(15+5)- in static block
        // - num1 is 10 once
       StaticBlockDemo st3 =new StaticBlockDemo();//constructor(20+5)

        System.out.println(StaticBlockDemo.num); //25

        StaticBlockDemo st4 = new StaticBlockDemo(50);

        System.out.println(StaticBlockDemo.num);// 75
    }

}
