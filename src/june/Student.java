package june;

public class Student {
    public static void main(String[] args) {

        Person man = new Person("Max",23);
        man.setAge(18);
        man.setName("Raul");
        System.out.println(man);
        System.out.println(man.toString());
        System.out.println(man.getName() + " "+ man.getAge());
    }
}
