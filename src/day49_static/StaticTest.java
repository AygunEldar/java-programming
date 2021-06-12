package day49_static;

public class StaticTest {
   static String word = " java";
    public static void main(String[] args) {

        //1)static method can be called using classname
        Static_Method.displayMessage("wooden spoon");

        //1) instance method needs an object to be called
        //Static_Method.instanceMethod(); ---> ERROR
        Static_Method stm = new Static_Method();
        stm.instanceMethod();

        //2)static method can only access other static variables and  methods
        System.out.println(word);//without static before String it does not work
    }
}
