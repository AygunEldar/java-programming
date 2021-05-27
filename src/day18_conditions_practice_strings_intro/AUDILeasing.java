package day18_conditions_practice_strings_intro;

public class AUDILeasing {
    public static void main(String[] args) {

        String make = "AUDI";
        String model = "SQ 5"; //"A3"
        double leasePr = 0.0;


        if (make.equals("Audi")) {
            if (model.equals("SQ5")) {
                leasePr = 600.0;
            } else if (model.equals("A3")) {
                leasePr = 700.0;
            }

        }
                System.out.println("make = " + make);
                System.out.println(" model = " + model);
                System.out.println(" lease price = " + leasePr);




    }
}