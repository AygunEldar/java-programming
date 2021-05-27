package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = " Mercedes";
        String model = "E";//"A"
        double leasePrice = 0.0;

        double mod2 = 400.0;

//         if (make.equals("Mercedes") && model.equals("E")) {
//             leasePrice = 500.0;
//         }else if (make.equals("Mercedes") && model.equals("A")) {
//             leasePrice =400.0;
//         }

        System.out.println("**********************************");

        if (make.equals("mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            } else if (model.equals("A")) {
                leasePrice = 400.0;
            }
        }


        System.out.println("make = " + make);
        System.out.println(" model = " + model);
        System.out.println(" lease price = " + leasePrice);

        System.out.println("-************* AUDI**************-");


        }
    }
