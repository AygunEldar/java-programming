package day51_inheritance_overriding;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee developer= new Employee();
      developer.jobTitle = "Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
       double  annualDevSalary = developer.calculateSalary(55.0);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));

        Contractor sdetContractor1 = new Contractor();
        sdetContractor1.jobTitle = "SDET";
        double sdetSalary = sdetContractor1.calculateSalary(55.0);
        System.out.println("sdetSalary = " + sdetSalary);

        System.out.println(developer.toString());
        System.out.println(sdetContractor1);


    }
}
