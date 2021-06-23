package officehours06_22;

public class Amazon extends OnlineShopping implements AllowUsersToSell{
    //Create a concrete class Amazon
    //    - Inherit OnlineShopping and implement all abstract methods
    @Override
    public void viewCart() {

        System.out.println("Viewing Amazon Card");
    }

    @Override
    public boolean payForShipping(double price) {

        return price > 50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying Item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning Item to Amazon");

    }

    @Override
    public void upLoadProduct() {

    }
}
