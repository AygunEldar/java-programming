package officeHourPracrice_03_03;

public class Apartment {
    public static void main (String [] args ){

        String address = "6787 Joseph Siewick ";
        String nameOfOwner ="Roger Federer";
        int  numOfUnits = 11;
        int averSizeofEachU =450;
        int monthlyRentAm =3000;
        byte numOfWD =4;
        boolean allowsPet = false;
        boolean hasAPool =true;
        short lengthOfLease =8;
        byte totalNumOfResidinBuil = 18;
        String phoneOfOwn ="(505)8045656" ;
        boolean gasStation = false;
        byte numOfFloors = 3;
        boolean hasABase =true;
        boolean hasAvailUnForRent = false;
        boolean hasAirCond =true;
        int numOfParkingSp = 22;
        boolean hasWheelchAcc = true;
        char numOfReviewSt ='5';
        double after3YearsRDisc = monthlyRentAm - monthlyRentAm * 0.1;
        double after6YearsRDisc = monthlyRentAm - monthlyRentAm * 0.2;


        int averNumOfResPerU = totalNumOfResidinBuil / numOfUnits;
        int averNumOfParkSpPerU = numOfParkingSp / numOfUnits;
        int averNumOfUnitsPerFl = numOfUnits / numOfFloors;


        System.out.println( " * * * * * APARTMENT * * * * *" );
        System.out.println();
        System.out.println("Address :  " +address);
        System.out.println("Owner name : " + nameOfOwner);
        System.out.println("Phone number of the Owner : " + phoneOfOwn);
        System.out.println("Number of Units - " + numOfUnits+
                        "\nNumber of floors - " +numOfFloors +
                 "\nNumber of Parking Space - " + numOfParkingSp+
                "\nNumber of wash\\ driers - " + numOfWD);
        System.out.println("To have a pet - " +allowsPet+ " is not allowed !");
        System.out.println("It has a pool - " +hasAPool);
        System.out.println("It has a basement - " +hasABase);
        System.out.println("There is a Gas Station - " +gasStation +
                "\nThere is an Air Conditioner System - " + hasAirCond);
        System.out.println("There is a path for a wheelchair - " + hasWheelchAcc);
        System.out.println();
        System.out.println("Monthly Rent : " + monthlyRentAm );
        System.out.println("The length of lease is : " + lengthOfLease + " years . ");

        System.out.println(after3YearsRDisc);
        System.out.println(after6YearsRDisc);

        System.out.println(averNumOfResPerU);
        System.out.println(averNumOfParkSpPerU);
        System.out.println(averNumOfUnitsPerFl);
    }
}
