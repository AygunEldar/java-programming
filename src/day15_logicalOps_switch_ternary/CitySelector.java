package day15_logicalOps_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {

        String city = "Tampa";
        // String city2 = "Tampa";

        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering " + city);
        }

        String city1 = "Moscow";
        String city2 = "Tampa";


        System.out.println("Not considering " + city2);


        // Saim //

        String teacher = "Murodil";

        if (teacher.equals("Murodil") || teacher.equals("Saim")) {
            System.out.println("Java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill with " + teacher);
        } else {
            System.out.println("Some other class with " + teacher);
        }

        String company = " NadirTech";
        double salary = 105_000.0;
        if (company.equals("Google") || salary >= 100_000) {
            System.out.println("Accepting offer from " + company);
        } else {
            System.out.println("Rejecting offer from " + company);
        }


    }

}



