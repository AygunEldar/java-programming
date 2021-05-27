package day17_ternary_nested_condition;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 40;
        String reply = "accept";
        reply = (hourlyRate > 45) ?"accept" : "reject";
        System.out.println("reply- " + reply);

        System.out.println("**************************************");
        
        String todaysClass = "java";
        String teacher = (todaysClass == "java") ? "Murodil/Saim" : "Nadir";
        System.out.println("teacher = " + teacher);

        System.out.println("********************************");

        boolean isEligibleDrive = true;
        String driving = isEligibleDrive  ? "Have DL, can drive" : "No DL, can not drive";
        System.out.println("driving = " + driving);
    }
}
