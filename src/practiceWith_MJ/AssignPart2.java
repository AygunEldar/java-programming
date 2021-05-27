package practiceWith_MJ;

import java.util.ArrayList;
import java.util.Arrays;

public class AssignPart2 {
    public static void main (String [] args){

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(100);//[100]
        numbers.add(-2); //[100,-2]
        numbers.remove(1);//[100]
        numbers.add(1,25);//[100,25]
        numbers.add(numbers.remove(0));//[25,100]first remove 100, then add 100
        System.out.println(numbers);//[25,100]


        System.out.println("********************************");

        ArrayList<String>names = new ArrayList<>(Arrays.asList("Andy","Bart","Carl","Elmo"));
        names.add(names.remove(2));//[Andy,Bart,Elmo,Carl]
        names.set(names.indexOf("Andy"),names.remove(2));//[Elmo, Bart,Carl]
       // names.remove(names.set(0,"MJ"));//[MJ, Bart , Carl]
        System.out.println(names);
        //set is a method which replace a value in specific  index with another value
        //but also it will return the original value of the index
    }

}
