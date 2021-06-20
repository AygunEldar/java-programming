package day53_inheritance.hiding;

public class Mobile extends Phone {
    String type = "Mobile phone";
    /*
    Method Hiding
    we are hiding use()static  method

     */

    public static void use(){
        System.out.println("Using mobile phone");
        System.out.println("Thank you for helping");

        int a = 5;
        int b = 10;
        System.out.println(a  * b);
    }

    public void  text(){
         use();
        System.out.println("and sending a text message");
    }
    @Override
    public void call(){
        use();
        System.out.println("and calling on mobile");
    }
}
