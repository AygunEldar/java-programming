package day27_for_loop_examples;

public class ReadStringPortion {
    public static void main(String[] args) {

        String list = "cat,car,black cat,red car";

//        int i = 0;
//        System.out.println(list.substring(0,i+3));
//        i++;
//        System.out.println(list.substring(i,i+3));
//        System.out.println(list.substring(i,i+3));
//        System.out.println(list.substring(i,i+3));
//        System.out.println(list.substring(i,i+3));

        for(int i= 0; i< list.length()-2; i++){
            System.out.println(list.substring(i,i +3));
            //if statement, if list substring(i,i+3) equals"cat" or "car" -> print car or cat found
            String part =list.substring(i,i+3);
            System.out.println("part = "+ part);
            if(part.equals("cat") ||part.equals("car")){
                System.out.println("Car or Cat found");
            }
        }







    }
}
