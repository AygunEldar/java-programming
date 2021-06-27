package day57_abstraction_polymorphism.abst_VS_inter;

import day57_abstraction_polymorphism.abst_VS_inter.ConcreteA;
import day57_abstraction_polymorphism.abst_VS_inter.InterfaceA;

public class Runner {
    public static void main(String[] args) {

//      AbstractA absA =  new AbstractA();
//      InterfaceA iA = new InterfaceA() ;
        // ERROR neither of them can not create OBJECT (instantiate)

        InterfaceA.staticMethodE("wooden spoon");
        //ConcreteA.staticMethodE("hello"); - >Error works with Interface
         ConcreteA.staticMethodC();

    }
}
