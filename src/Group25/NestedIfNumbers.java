package Group25;

public class NestedIfNumbers {
    public static  void main(String [] args ) {

        int a = 7;
        int b = 8;
        int c = 9;
        boolean equalOk = a == b || a == c || b == c ;

        if (equalOk){
            if( a <= b && b <= c ){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
                if(a < b && b < c){
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }

        }

//        if ((++a == b) && ++b == c ){
//            System.out.println("True");
//          //  if( 7 || 8 && 8 || 9 =false){
//
//            }



        }
    }

