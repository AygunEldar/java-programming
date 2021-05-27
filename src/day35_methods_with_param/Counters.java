package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(10);
        count(7);
//        int num = 999;
//        count(num);
        String word ="wooden spoon";
        count(word.length());
//        String str ="Azerbaijan";
//        count(str.length());
        int birthyear =2001;
        printAge(birthyear);
    }
   public static void count(int num){
         for(int i =0; i <= num;i++){
             System.out.print(i+ " ");
         }
       System.out.println();

   }

  public static void printAge(int year){
        int age = 2021-year;
      System.out.println("My age is "+age+", birthyear is " +year);
  }

}
