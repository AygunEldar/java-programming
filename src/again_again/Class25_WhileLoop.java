package again_again;

public class Class25_WhileLoop {
    public static void main(String []args ){

        boolean isHungry = true;
        int bananas =0;
        int countToFull =3;

         while(isHungry){
             bananas++;
             System.out.println("Eat one banana");
           //  isHungry = bananas == countToFull ? false : true;
           if(bananas == countToFull);
              isHungry = false;

         }

 System.out.println("Had enough bananas, go coding");
    }
}
