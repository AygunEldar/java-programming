package April;

public class Class32_Split_Array_index_boolean {
    public static void main (String [] args){

        String[] items  = {"Pen", "Bag","Pencil", "AirPod", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("*******************Find the index of pencil*******************");

       for(int i= 0; i< items.length; i++){
           if(items[i].equalsIgnoreCase("bag")){
               System.out.println("The index of bag is "+i);
               break;
           }
       }

    for(int k =0; k < items.length; k++){

        if(items[k].equalsIgnoreCase("pen")){
            System.out.println("The index of pen is " +k);
            break;
        }
    }


   System.out.println("------------boolean-------------------");

    boolean isBagExists = true;

      for(String shop : items){
          if(shop.equalsIgnoreCase("bag")){
              isBagExists = true;

              break;
          }
      }

        System.out.println("There is a bag " + isBagExists);

    }

}
