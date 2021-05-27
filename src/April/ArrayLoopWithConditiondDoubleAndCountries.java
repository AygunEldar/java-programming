package April;

public class ArrayLoopWithConditiondDoubleAndCountries {
    public static void main(String[] args) {

        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Azerbaijan", "Brazil", "China", "Cuba",  "Sweden",  "France",  "Vietnam", "Albania",  "Brazil",
                "Portugal",  "Philippines", "Philippines",  "China",   "Philippines",  "Philippines",  "Colombia",
                "Philippines","Honduras","Indonesia","Brazil","United States","Russia"};

   for(int i =0; i <= countries.length- 5; i++){
       System.out.println(countries[i] + ", "+ countries[i+1] + ", "+ countries[i+2] + ", "+countries[i+3] + ", "+countries[i+4]);
   }


   for(double cost : prices) {
       if (cost >= 100) {
           System.out.println(cost + " ");
       }
   }

        System.out.println("*******************************");
       for(double value  : prices){

           if(value > 50 && value <100){


           }
           System.out.print(value + " ");
       }

        System.out.println("**********count more than 40*************");
       int count = 0;

       for( double n  : prices ){

           if(n > 40){
               count++;
           }

       }

        System.out.println("all are " + count + " costly");


        System.out.println("-----------------COUNTRY NAMES--------------------------");

         for(String land : countries){

             if(land.length() >=9){
                 System.out.println(land + " "+ land.length() + ",");
             }

         }
        System.out.println();
        for(String country  : countries){

            if (country.startsWith("A")){

                System.out.print(country + ", ");
            }
        }
        System.out.println("***************************************");
             for(String lands : countries){

              if(lands.endsWith("a") || lands.endsWith("es")){

           System.out.println(lands + ", ");
       }
   }

         int add =0;
             for ( String zone : countries){
                 if(zone.endsWith("es")){
                     add++;

                 }

             }
        System.out.println(add +" counties ends with -es");

            String country =String.join(" * ",countries);
        System.out.println(country);


    }
}
