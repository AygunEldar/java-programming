package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {

        double balance =1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        //decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);
        
        double kunafa = 44.45;
        System.out.println("kunafa = " + kunafa);
        balance = balance - kunafa;
        System.out.println("balance after kunafa = " + balance);
        //second kunafa is 50% off
        kunafa = kunafa / 2;
        System.out.println("kunafa = " + kunafa);
        //buy it and decrease balance with kunafa price
        balance =balance - kunafa;
        System.out.println("balance after   the second kunafa = " + balance);
        
        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " + balance);

        double icedtea = 3.0;
        System.out.println("icdetea = " + icedtea);
        //buy 4 icedteas and decrease balance
        balance = balance - icedtea*4;
        System.out.println("balance after 4 icedteas = " + balance);
        //return baklava
        balance = balance +baklava;
        System.out.println("balance after returning  = " + balance );


    }
}
