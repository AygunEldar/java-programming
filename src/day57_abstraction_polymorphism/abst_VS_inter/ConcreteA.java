package day57_abstraction_polymorphism.abst_VS_inter;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {

    @Override  //Concrete sucClass must override absmethod from absClass or interface
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");

    }
    @Override
    public  void methodB(){ //sub class can override non-final meth from parent class
        System.out.println("methodB overridden version is called");

    }
    //@Override ERROR it is hidden
    public  static void staticMethodC() { //static meth are hidden - not override
        System.out.println("staticMethodC hidden version is called");
    }

        @Override

        public void absMethodD(int num){
            System.out.println("absMethod overridis called -" + num);

        }
    }

