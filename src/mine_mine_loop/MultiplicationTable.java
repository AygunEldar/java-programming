package mine_mine_loop;

public class MultiplicationTable {
    public static void main(String[] args) {

        int num =2;
        for(int i=1; i <= 10; i++){

            int result = num*i;
            System.out.println(num+" x "+ i +" =" + result);
        }
        System.out.println("*********************************");
        for(int i=1; i <= 10; i++){

            int result = num*i;
            System.out.println(result +" : "+ num +" = " +i);
        }

    }
}
