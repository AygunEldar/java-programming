package day58_polymorphism.shopping;

public class Amazon extends OnlineShop implements Prime{

    @Override
    public void buy() {
        System.out.println("buying items on amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("Selling item on amazon.com");

    }


    @Override
    public void primeShipping() {
        System.out.println("Free- 2days shipping for Prime users");
    }
}
