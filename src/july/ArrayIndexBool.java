package july;

public class ArrayIndexBool {
    public static void main(String[] args) {

//
//        for (int i = 0; i < 10; i++) {
//            if(i==5){
//                break;
//            }
//            System.out.println("num " +i);
//        }

        System.out.println("*******************");
        String [] items ={"dog","frog","cat","bat"};

        boolean isDogExist =true;

        for(String animals : items){
            if(animals.equalsIgnoreCase("frog")){
                System.out.println("There is a frog " + isDogExist);

                break;

            }
        }

}
}
