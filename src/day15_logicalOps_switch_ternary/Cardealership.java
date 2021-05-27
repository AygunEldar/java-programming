package day15_logicalOps_switch_ternary;

public class Cardealership {
    public static void main(String[] args) {

        double budget = 5000.0;
        double carPrice = 8500.0;
        String model = "Honda";

        if((carPrice <= budget) && (model.equals("Toyota") || model.equals("Honda"))) {
            System.out.println("Ready to purchase model = "+ model + " price = $ "+ carPrice);
        }else{
            System.out.println("Not interested in model = "+ model +" price = $ "+ carPrice);
        }
        System.out.println("******************************************");


    }
}
