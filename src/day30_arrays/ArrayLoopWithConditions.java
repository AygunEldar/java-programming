package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main (String [] args) {

        double [] price = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String [] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Philippines",
                "Azerbaijan",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};


 // print all numbers from prices array that are more than 100//

        for( double each : price){
            if ( each > 100){
                System.out.println(each + " ");
            }

        }

        System.out.println("\n ---------prices between 10 and 70--------");
        for ( double each : price) {
            if (each >= 10 && each <= 70) {

                System.out.println(each);
            }
        }

        System.out.println("\n ----------count of the prices more than 50");
        int count = 0;

        for ( double cost : price) {
            if (cost  > 50 ) {
              count++;

            }

        }
        System.out.println("count " +count);



        // countries name length more than 7 -inclusive

        for (String name : countries){
            if(name.length() >= 7 ){
                System.out.println(name+" - "+name.length() + " " );
            }

        }

    }
}
