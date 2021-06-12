package day49_static;

public class Static_Method {

    int num = 10;//if it was inside or static would be worked
   static  int count = 5 ;

    public static void displayMessage(String message){

        System.out.println("message: " +message);
       // System.out.println(" num " + num);//ERROR: num is instance variable, static can not accsess
        System.out.println(" count " + count);// NO ERROR count is static
    }
    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("wooden spoon");

    }
    //StaticMethod.instanceMethod(); ------>  NO
    //StaticMethods stm = new StaticMethod();
    //stm.instanceMethod();
    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println("num = " + num);
        System.out.println("count = " + count);

    }
}
