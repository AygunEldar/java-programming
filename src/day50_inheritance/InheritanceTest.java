package day50_inheritance;

public class InheritanceTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Bob";
        p1.age = 30;
        p1.walk();
        p1.talk();
        p1.work("SDET");

        Teacher t1 = new Teacher();

        t1.name ="Saim";
        t1.talk();
        t1.age = 26;
        t1.teacherID = 1234;
        t1.walk();
        t1.teach("Java inheritance");

        System.out.println("*****************");

        Student student = new Student();
        student.name = "Alex";
        student.age =15;
        student.talk();
        student.walk();
        student.school = "CyberTekSchool";
        student.work("Java programmer");

        student.study("Coding");



       // student.school = "CyberTekSchool";// will print null
        //Because remember the code still reads top to bottom.
        // If you change the name of the school after calling the
        // study method, which is the one printing,
        // then the school wasn't been assigned yet
        // so it prints null, but if you assign and
        // then call the method, it has a value that can be printed
    }

}
