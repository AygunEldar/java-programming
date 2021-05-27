package day30_arrays;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class
StudentsArray {
    public static void main (String [] args){

        String[] student1  = new String [5];
        student1 [0] ="AZ5655";
        student1 [1]= "Adam";
        student1[2] = "Brown";
        student1[3] ="22";
       student1 [4] ="845 8585";


       String[] student2 = {"MK12345", "Adam", " Bloomberg", "B22", " 456-789823"};

        System.out.println("student1 id -"+ student1 [0]);
        System.out.println("student1 firstname -"+student1 [1]);
        System.out.println("student1 lastname -"+ student1[2]);
        System.out.println("student1 batch # -"+ student1[3]);
        System.out.println("student1 phone -"+ student1 [4]);

        System.out.println("student data length: " +student1.length);


        //check student1 array contains 5 items
        //true pass correct length
        // false fail incorrect length

        if(student1.length ==5) {
            System.out.println("Pass: data array has correct length");
        }else{
            System.out.println("Failed: data array has incorrect length");
        }


        if(student1.length == student2.length){
            System.out.println("Passed -  data arrays length match");
        }else{
            System.out.println("Failed -  data arrays length match");
        }


        System.out.println((student1[1] +" "+ student1[2]).toUpperCase());//or separately


    }
}
