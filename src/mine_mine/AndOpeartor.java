package mine_mine;

public class AndOpeartor {
    public static void main(String [] args ){

        String drink ="tea";
         boolean hot = true;
         boolean free = true;

         boolean bool =(drink.equals("coffee") && hot && free);
             System.out.println(bool);

             bool =drink.equals("coffee") & hot;
             System.out.println(bool);


    }
}
