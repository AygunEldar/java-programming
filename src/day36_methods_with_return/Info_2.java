package day36_methods_with_return;
import java. util.*;
public class Info_2 {
    public static void main(String[] args) {

        fullName();
        isMarried();
        getAge();
        getRandomYear();
        System.out.println("Fullname = "+ fullName());
        System.out.println("isMarried = "+ isMarried());
        System.out.println("Age = " +getAge());
        System.out.println("Random year "+getRandomYear());// dynamic different year each time

          String name = fullName();
          boolean married = isMarried();
          int age =getAge();
          int year =getRandomYear();
        System.out.println("name = "+ name);
        System.out.println("married = "+ married);
        System.out.println("age= "+ age);
        System.out.println("year = "+ year);
if(isMarried()){
    System.out.println("married");
}else{
    System.out.println("single");
}
    }

    public static String fullName() {
//        System.out.println("inside Fullname " + fullName());
        return "Mike Smith";
    }
         public static boolean isMarried(){
             return false;
        }

        public static int getAge(){
        int age =35;
        return age;
        }
         public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
}
}
