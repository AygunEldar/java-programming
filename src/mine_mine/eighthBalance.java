package mine_mine;

public class eighthBalance {
    public static void main (String [] args) {

        double balance = 2459.54;
        System.out.println("Balance: "+ balance);

        double potatoes = 5.60;
        balance = balance - potatoes;
        System.out.println("Balance after potatoes: " +balance);

        double tomato = 9.45;
        balance = balance -tomato;
        System.out.println("Balance after tomatoes: "+balance);

        double cake = 56.00;
        balance = balance - cake;
        System.out.println("Balance after cake: "+balance);

        double pizza = 78;
        balance -=2*pizza;
        System.out.println("Balance after pizza: "+balance);

        balance = balance + cake;
        System.out.println("Balance after remaining : " + balance);

        System.out.println("5+2= " + 3+4);
        System.out.println("5+2= " +(3+4));



    }
}
