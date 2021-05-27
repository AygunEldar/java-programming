package officehourPractice_03_02;

public class Zoo {
    public static void main (String [] args ) {
        String name = "ZOO", foundedDate = "March 3,1960", startTime = "7.00 AM" , closingTime = "5:00PM";
        boolean isOpenOnHolidays = true , hasAquarium = false;
        int bigCats =20 , hoofedAnimals = 30 , reptiles = 15, birds = 40,primates =10, numOfEmployees =75;
        double tickForAdults = 42.67, tickForchildren = 15.0;
        boolean rules = true;




        System.out.println("* * * * * WELCOME TO THE "+ name +( " * * * * *") );
        System.out.println("Foundation Date " + foundedDate);
        System.out.println("Open : " +startTime +  "\nClose : " + closingTime);
        System.out.println("It is open on Holidays : "+ isOpenOnHolidays +"\nThere is aquarium : " + hasAquarium);
        System.out.println("We have different type of animals : \n\t\t\t\t\t\t\t\t" + " Big Cats : "+bigCats);
        System.out.println("\t\t\t\t\t\t\t\t Hoofed animals " + hoofedAnimals);
        System.out.println("\t\t\t\t\t\t\t\t Reptiles: " +reptiles);
        System.out.println("\t\t\t\t\t\t\t\t Birds : "+ birds);
        System.out.println("\t\t\t\t\t\t\t\t Primates : " +primates);
        System.out.println("Price of Tickets :\t\t\t\t $ " + tickForAdults + "\n\t\t\t\t\t\t\t\t $" +tickForchildren);
        System.out.println("We have exact rules -  "+ rules + " and   "+ numOfEmployees + "employees .");
    }
}
