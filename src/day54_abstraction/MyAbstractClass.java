package day54_abstraction;

public  abstract class MyAbstractClass {

    int num = 55;
  public  void learn(){
      System.out.println("Learning ....");
  }
public abstract  void  close();

  public static void speak(){

  }
}


class Sub extends  MyAbstractClass {
    public void close(){
        System.out.println("Close - abstract method implementation");
    }
}
class MyObjects{
    public static void main(String[] args) {
       // MyAbstractClass mac = new MyAbstractClass();
        Sub sub = new Sub();
        sub.learn();
        System.out.println(sub.num);
        sub.close();

    }
}