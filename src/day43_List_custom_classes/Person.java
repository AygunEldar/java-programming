package day43_List_custom_classes;

public class Person { // class as a templet  //these data types are sources for this class
//data -> variables
    String firstName;
    int age;
    char gender;

    //behaviour
    public void speak (){
        System.out.println("Person is speaking");
    }
}

 class People{ // class for running with main  method
     public static void main(String[] args) {
         //create object of person class - Instantiate person class

        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age =33;
        person1.gender ='M';
        person1.speak();

        // System.out.println(person1.firstName + " is " + person1.age + "years old");
         System.out.println(person1.firstName);
         System.out.println(person1.age);
         System.out.println(person1.gender);

         Person person2 = new Person ();
         person2.firstName = "Mike";
         person2.age =12;
         person2.gender ='M';
         person2.speak();

         System.out.println(person2.firstName);
         System.out.println(person2.age);
         System.out.println(person2.gender);

         System.out.println(""+person1.firstName);

     }
 }