package April;

public class String_CharArray_07 {
    public static void main(String[] args) {
        String item ="wooden spoon";
        char [] letters =item.toCharArray();
        System.out.println(letters);
        System.out.println("simple String length "+item.length());
        System.out.println("charArray length "+letters.length);


        System.out.println("*****************************************");

        String[] fruits = {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"};

         for(int i= 0; i <= fruits.length-3;i++){
             System.out.println(fruits[i]+", " +fruits[i+1]+", "+ fruits[i+2]);
         }


      for(String each : fruits) {
          System.out.print(each + " ");

          String vitamin = "";
          vitamin += each + "-";
          System.out.print("\n" + vitamin);
      }
        System.out.println("\n"+String.join(" <> ",fruits));
        System.out.println("\n" +String.join(" * " ,fruits));


    }
}
