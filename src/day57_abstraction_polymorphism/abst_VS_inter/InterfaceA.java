package day57_abstraction_polymorphism.abst_VS_inter;

public interface InterfaceA {

    //interface can only have FINAL variables
    public  static final String TYPE = "interface";
    double MAX_COUNT = 500;//this is autom final

    /*
    //public InterfaceA(){//Interface class  can not have CONSTRUCTOR }

     */


    public abstract  void absMethodD(int num);
    // before Java8 interface was pure abs. ,
    // only abs. method were allowed, public abs.
    // is automatically added, so it is optional
    // to type it void absMethodD(int num ) is enough

    /*
    starting from Java 8(jdk 1.8)
    interface can have static and default methods
     */
    public static void staticMethodE(String str){

        System.out.println("staticMethodE is called with str - " +str);
    }

    //default method is a method with the body in the interface
    public default void  defaultMethodF(){
        System.out.println("defaultMethodF is called");
    }
}
