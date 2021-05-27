package saim_only_03_15;

public class HouseBuyer {
    public static void main(String[] args) {

        String name="Canyon";
        double averagePrice=0.0;
        double rating = 4.0;
        boolean gated = false;
        boolean allowPets = true;
        switch(name){
            case "Hills":
                System.out.println("The house information in Hills: ");
                averagePrice = 890.000;
                rating = 4.0;
                gated = false;
                allowPets = true;
                break;
            case "Oaks":
                System.out.println("The house information in Oaks: ");
                averagePrice = 750.000;
                rating = 3.5;
                gated = false;
                allowPets = true;
                break;
            case "Highland":
                System.out.println("The house information in Highland: ");
                averagePrice = 150.000;
                rating = 4.5;
                gated = true;
                allowPets = false;
                break;
            case "Canyon":
            System.out.println("The house information in Canyon: ");
            averagePrice =201.000;
            rating = 4.8;
            gated = true;
            allowPets = true;
            break;
            default:
                System.out.println("Available");

        }
        System.out.println("The neighbourhood name: " +name+ "\nThe average house price: $ "+
                averagePrice+ "\nRating of school (out of 5): "+ rating + "\nGated community : "
                + gated+ "\nPets allowed: " + allowPets);
    }
}
