package practiceWith_MJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_01 {
    public static void main(String[] args) {

        ArrayList<Integer>myPrac = new ArrayList<>();
        ArrayList<Integer>myArray = new ArrayList<>(100);

        System.out.println("myArray = " + myArray.size());
        System.out.println("myPrac = " + myPrac.size());

        List<Integer>myArr = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(myArr);

        myArr.add(5);
        System.out.println(myArr);

        List <Integer>myArr1 =new ArrayList<>(Arrays.asList(5,6,7));
        System.out.println(myArr1);

        myArr = Arrays.asList(8,9);
        System.out.println(myArr);

        ArrayList <Integer>myArr2 =new ArrayList<>();
        myArr2.addAll(Arrays.asList(2,3,4,5,6));
        System.out.println(myArr2);

                         //DIFFERENCE
        myArr2.addAll(myArr1);//add another arr
        System.out.println("myArr2 = " + myArr2); //[2, 3, 4, 5, 6, 5, 6, 7]
        System.out.println(myArr2.addAll(myArr1)); // true

        myArr2.add(2,89);
        System.out.println("Add 89 " + myArr2);

//        myArr2.add(15,11);    //There is no index 15; size is 12
//        System.out.println("Add 11 in index " +myArr2);

        //System.out.println(myArr2.add(0,99));// you can't print so since it is void method

        myArr2.get(5);
        System.out.println(myArr2);//get 5th index - 6
        System.out.println( myArr2.get(5));

        myArr2.remove(2);
        System.out.println(myArr2);// removed 89
        System.out.println(myArr2.remove(5)); //removes the 5th
       // System.out.println(myArr2.remove("100"));// as String returns boolean false

        List <String>lang =new ArrayList<>(Arrays.asList("java","sel","c#","sql","python","javascript","ruby"));
        lang.remove("sel");
        System.out.println(lang);

        lang.remove(2);
        System.out.println(lang);
        System.out.println(lang.remove(2));
        System.out.println(lang.remove("ruby"));    //TRUE



        List<Integer>nums =new ArrayList<>(Arrays.asList(12,54,89,76,35,64,23));
        //nums.clearAll();

        nums.set(0,10);
        System.out.println(nums);
       // nums.set(nums.indexOf(0),77); outOFBound
        System.out.println(nums);









    }

}
