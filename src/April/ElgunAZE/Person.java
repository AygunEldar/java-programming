package April.ElgunAZE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
         /*
this class explains how to compare custom objects
and teach you how to store custom objects in the Set which instance of values could be same
 */

//Comparable -

        private int age;
        public String name;
        public Person(int age){
            this.age = age;
        }

        /*
        if you want to store custom object which all instance values are same in the Set
        override equals() and hashCode() methods
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age;
        }

        @Override
        public int hashCode() {
            return Objects.hash(age);
        }

        public int getAge() {
            return age;
        }



/*
        if you want to compare you custom Objects based on instance variables first you need to implement Comparable <Custome object type> interface
        then override compareTo() and give some codnitions
         */
//    @Override
//    public int compareTo(Person person) {
//        if(this.age > person.age ){
//            return 1;
//        }else if(this.age == person.age){
//            return 0;
//        }else{
//           return  -1;
//        }
//    }
    }
    class Test{
        public static void main(String[] args) {
            Person person1 = new Person(1);
            Person person2 = new Person(12);
            Person person3 = new Person(1);
            Person person4 = new Person(1);

            Set<Integer> list = new HashSet<>(Arrays.asList(new Integer(1),new Integer(1),new Integer(1)));
            System.out.println(list);


            Set<Person> set = new HashSet<>(Arrays.asList(person1,person2,person3,person4));
            System.out.println(set.size());
            person1.hashCode();
        }
    }



