package day50_inheritance;
/*
Sub class
child class
Derived class
 */
public class Teacher extends Person{

    int teacherID;
    public void teach(String topic){

        System.out.println("Teacher is teaching " +topic);
        System.out.println("Teacher name is " +name);
        System.out.println("Teacher age is " + age);
        System.out.println("Teacher teacher ID is  " + teacherID);


    }
}
