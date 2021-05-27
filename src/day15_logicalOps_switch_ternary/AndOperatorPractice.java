package day15_logicalOps_switch_ternary;

public class AndOperatorPractice {
    public static void main (String [] args) {

       boolean onSale = true;
        boolean freeShipping = true;
        String item = "book";

        if ( onSale && freeShipping){
            System.out.println( "Adding to cart " + item );

        }else{
          //  System.out.println("Continue shopping for good deals on - " + item);
        }
        // add to cart only when it is freeShipping, onSale,

        if(freeShipping && onSale && item.equals("book")){
        System.out.println("Add to cart - " + item);
    } else{
        System.out.println("Continue shopping good deals on - " +item);
    }
        //location, salary, remote, benefits


    }

}
