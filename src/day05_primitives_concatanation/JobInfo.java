package day05_primitives_concatanation;

public class JobInfo {
    public static void main (String [] args ){
        String title = "Java SDET";
        String company = "palo Alto Networks";
        String jobDescription ="Experience in Java , Selenium,Cucumber";
        Double salary = 156.200;
        byte yearsExp = 7;
        boolean hasBenefits = true;

        System.out.println("Title:  " + title);
        System.out.println("Company: "  + company);
        System.out.println("Job description: "  + jobDescription);
        System.out.println("Salary: $"   + salary);
        System.out.println("Years of experience: "  +yearsExp);
        System.out.println("Benefits:" + hasBenefits);
    }
}
