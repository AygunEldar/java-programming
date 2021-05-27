package day05_primitives_concatanation;

public class CellPhone {
    public static void main (String [] args ){
          String brand = "Apple";
          String model= "iPhone11";
           String color = "Green";
          double price = 699.0;
          int storage = 256 ;
         boolean hasCamera = true;

         System.out.println(brand);
         System.out.println(model);
         System.out.println(price);
         System.out.println(storage);
         System.out.println(hasCamera);

         // WITH MESSAGE
        System.out.println(brand  +  "is Brand");
        System.out.println("Model is "  +  model );
        System.out.println(" Color is "  +  color );
        System.out.println("Price is $ "  + price);
        System.out.println("Storage is  "  + storage +"GB");
        System.out.println("Has camera? " +hasCamera);
    }
}
