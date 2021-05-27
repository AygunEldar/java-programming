package April;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[4];
        student1[0] = "SE12345";
        student1[1] = "Adam";
        student1[2] = "Tomas";
        student1[3] = "456-859-56-56";


        String[] student2 = {"DE45689", "Brenda", "Scot", "546-879-56-23"};

   if(student1.length ==4){

       System.out.println("passed");

   }else{

       System.out.println("failed");
   }

  if( student1.length == student2.length){

      System.out.println("correct");

  }else{

      System.out.println("incorrect");
  }


            System.out.println((student1[1] +" "+ student1[2]).toUpperCase());
        System.out.println(student1[1].toUpperCase() + " "+ student1[2].toUpperCase());
    }
}