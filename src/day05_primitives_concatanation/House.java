package day05_primitives_concatanation;

public class House {
    public static void main (String [] args){
        String house = "apartment";
        int numberOfBedRooms = 4;
        int numberOfKitchens = 2;
        int numberOfBathrooms = 5;
        boolean isThereBasement = true;
        boolean isThereanAttic = false;
        boolean isThereaPool = true;
        boolean isThereaHouseForSale = false;
        double costOftheHouse = 456000.0;
        String adress = "6556White Dove";
        int zipcode= 21125;
        boolean isThereaParkNearBy = true;
        int ratingOfSurroundingSchoolDistrictoutof5 = 4;

        System.out.println("The type of house: "             +house);
        System.out.println("The number of bedrooms are: "   +numberOfBedRooms);
        System.out.println("The number of kitchens are: "   +numberOfKitchens);
        System.out.println("The number of bathrooms are:"   +numberOfBathrooms);
        System.out.println("There is a basement: " +        isThereBasement);
        System.out.println("There is an attich: "  +         isThereanAttic);
        System.out.println("There is a pool: "  +           isThereaPool);
        System.out.println("There is a house for sale: "   +isThereaHouseForSale);
        System.out.println("Cost: " +"$"                  +costOftheHouse);
        System.out.println("Adress;  " +adress);
        System.out.println("Zipcode:  "  + zipcode);
        System.out.println("There is a park nearby: " + isThereaParkNearBy);
        System.out.println("School qualification:  " +ratingOfSurroundingSchoolDistrictoutof5);
    }
}
