package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {

//        **below is infinite loop with for loop like: while (true){}
//        for(;;){
//            System.out.println("Java is fun!");
//        }
        for(int i=0; i<=5 ; i++){
            System.out.println("Hello world");
        }
        // for loop: 1-10.print the numbers
     //                5)    7)
//               1)    2)    4)
        for(int s=1; s<=10; s++){
            System.out.println(s);//3) 6)
        }
    }
}
