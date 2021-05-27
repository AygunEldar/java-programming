package day29_nestedLoop_ArrayIntro;

public class MultiplicationTableNestedLoop {
    public static void main (String [] args){
        for(int outer =1; outer <=10; outer++){
            for(int inner =1; inner <= 10; inner++){
                System.out.print(inner * outer +"\t ");
            }
            System.out.println();
        }
    }
}
