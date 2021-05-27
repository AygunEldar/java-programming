package mine_mine;


public class Ternary1 {
    public static void main(String[] args) {


        System.out.println("Enter your payment");
       String rest = "zoo";
      int payment= rest.equals("museum") ? 50 : 30;
        System.out.println(payment);
        System.out.println("************************************************");
      int fee =11;
      String tea = (fee < 20) ? "black tea" : "green tea";
        System.out.println("tea = " + tea);

        System.out.println("*************************************************");
        int age=13;
        String man = (age >8) ? "teenager" : "kid";
        System.out.println("man = " + man);
    }
}
