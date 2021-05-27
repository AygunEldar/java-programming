package again_again;

public class Class28_breakVsContinue {
    public static void main (String [] args){

        for(int n =1;n <=5 ;n++){
            System.out.println(n);
            if (n == 3){
                break;
            }

        }
        for(int i =1 ; i <=5; i++){
            if(i == 4 || i == 2){
           continue;
            }
            System.out.print(i);
        }
    }
}
