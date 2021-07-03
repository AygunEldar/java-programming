package day58_polymorphism.shopping;

public class Etsy extends OnlineShop implements Prime {

    @Override
    public void buy() {
        System.out.println("Buy from Etsy");
    }

    @Override
    public void sell() {
        System.out.println("Sell on Etsy");
    }

    @Override
    public void primeShipping() {
        System.out.println("Prime members");
    }
}
