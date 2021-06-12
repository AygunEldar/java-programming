package day50_inheritance;

public class Student extends Person{
    //Student IS-A Person
    String school;

    public void study(String topic){
        System.out.println(name + " is studying " + topic +" at " +school);
        System.out.println(name +" age is "+ age );
    }
}
