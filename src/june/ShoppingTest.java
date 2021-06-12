package june;

public class ShoppingTest {
    public static void main(String[] args) {

        System.out.println(Shopping.applePrice);
        System.out.println(Shopping.bananaPrice);

       Shopping user = new Shopping();
        user.showTotal();
       // System.out.println(Shopping.showTotal());

        Shopping customer =new  Shopping();
        customer.showTotal();
    }

}
