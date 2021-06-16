package day54_abstraction;


    /**
     * Online Student class will EXTENDS Student
     * This class is considered to be concrete class
     * It is responsible to implement all abstract method (if)any
     */
    public class OnlineStudent extends Student {
   //So attendClass only shows WHAT it can do , but not HOW by using abstract methods

       //attendClass abstract method is implemented by the sub class
        // Sub class is overriding the abstract method of parent

        @Override
        public void attendClass() {
            System.out.println("Online student is attending the class using Zoom");
        }

       // public abstract  void  askQuestion();-ERROR -abstract method can not be in normal class
    }