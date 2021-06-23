package officehours06_22;

public class Walmart extends OnlineShopping {

    @Override
    public void viewCart() {

    }

    @Override
    public boolean payForShipping(double price) {
        return false;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Walmart");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Walmart");
    }
}
