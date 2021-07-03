package day58_polymorphism.shopping;

public abstract  class OnlineShop {

   public abstract   void buy();
    public abstract   void sell();

    public  void ship(){  //u don t need to override them
        System.out.println("Shipping the purchase items");
    }
}
