package officehours06_22;

public class Ebay extends OnlineShopping implements AllowUsersToSell{


   // Create a concrete class Ebay
  // - Inherit OnlineShopping and implement all abstract methods
    @Override
    public void viewCart() {
        System.out.println("View in Ebay card");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Ebay");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Ebay");

    }

    @Override
    public void upLoadProduct() {
        System.out.println("");
    }
}
