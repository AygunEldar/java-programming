package mine_mine_loop;

public class IfReturn {
    public static void main ( String[] args ){

         int num = 7;
         if(num < 0 || num > 10){
             System.out.println("Invalid miltiplication");
             return;
         }
        for(int i=1; i <=10; i++ ){

            int result = num * i;
            System.out.println( num +" x " + i+ " = " + result);
        }



    }
}
