package day57_abstraction_polymorphism.abst_VS_inter;

public abstract class AbstractA {
int num1;
private  double price;
public static int count;
public final String TYPE = "abstract";
public static  final  String LANGUAGE = "java";

public AbstractA(){ //Abst.class have CONSTRUCTOR
    System.out.println("AbstractA class constructor");
}

    public abstract void absMethodA();

    public void methodB(){
        System.out.println("methodB is called");

    }

    public  static void staticMethodC(){
        System.out.println("Static methodC is called");
    }
}
