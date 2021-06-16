package day54_abstraction;

/*
we add abstract keyword to a class to make it an abstract class
we cannot object of Student class - meaning
 student student = new Student (); -----ERROR will show
 --> what can we do with this Student class? We can extend this class by sub class
 Student class will Parent class for all other types of  student related classes

 */
public abstract  class Student {
    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }

    public abstract void attendClass();

}



 // we can add abstract method into abstract class
 //abstract method --> is created using abstract keyword
 //and does not have the implementation / method body











