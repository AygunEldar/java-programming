package day43_List_custom_classes;

public class Company {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = " Adam Smith";
        emp1.jobTitle ="SDET.";
        emp1.work();
       // System.out.println(emp1.name);
        //System.out.println(emp1.jobTitle);

        Employee emp2 =new Employee();
        emp2.name ="Amy Brown";
        emp2.jobTitle ="doctor.";
        emp2.work();
       // System.out.println(emp2.name);
       // System.out.println(emp2.jobTitle);

        Employee emp3 =new Employee();
        emp3.name ="Alex";
        emp3.jobTitle ="designer.";
        emp3.work();

        Employee emp4 =new Employee();
        emp4.name ="Brenda";
        emp4.jobTitle ="PO.";
        emp4.work();


    }
}
