package day29_nestedLoop_ArrayIntro;

public class RowAndColumns {
    public static void main(String[] args) {
         for( int row =1; row <=3;row ++){
             for(int col =1; col <=5; col ++){
                 System.out.println("|"+row + "-"+ col);
             }
             System.out.println();
         }
    }
}
