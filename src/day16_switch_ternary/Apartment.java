package day16_switch_ternary;

public class Apartment {
    public static void main(String[] args) {
        System.out.println("******WELCOME ADAIRE APARTMENT**********");
        int numberOfBedrooms = 2;
        double startingPrice = 0.0;

        switch(numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
             startingPrice = 1454.0;
             break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice =2480.0;
                break;
            case 2:
                System.out.println("Two bedrooms apartment selected");
                startingPrice =3680.0;
                break;
            default:
                System.out.println("Currently " +numberOfBedrooms+" bedrooms not available");

        }
        System.out.println("Starting price $ " + startingPrice);

    }
}
