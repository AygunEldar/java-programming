package day51_inheritance_overriding;

public class Contractor extends Employee {

    @Override //10 lets everyone know that you are overriding this method
    //2) ensures that this method is being overridden. If not it shows Error

    public double  calculateSalary(double hourlyRate){

        return 50 * 40 * hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
