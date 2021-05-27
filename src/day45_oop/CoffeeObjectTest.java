package day45_oop;

public class CoffeeObjectTest {
    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount is -"+  myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("after refilling -"+ myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());

        //NOT- myCoffee.type = "Turkish coffee"; INSTEAD using a method
        myCoffee.setType("Turkish coffee");

        System.out.println("my coffee = " +myCoffee.getType());
          //describe my coffee - show all variable values
        System.out.println(myCoffee.toString());

// Add Another coffee object , set  values , call methods

        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " +coffee1.getType());
        
        //assign coffee1 to coffee2 
        //hey java, point coffee2 to same object as coffee1
        Coffee coffee2 = coffee1;
        System.out.println("coffee2.getType() = " + coffee2.getType());

        coffee2.setType("Espresso");
       // System.out.println( " new type" +coffee2);


        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");

        coffee3 = coffee2;
        System.out.println("coffee3.getType() = " + coffee3.getType());

        Coffee coffee4 = null;//reference variable does not refer /point to any object in HEAP
        coffee4.setType("Turkish coffee");//NullPointerException

    }

}
