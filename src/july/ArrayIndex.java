package july;

public class ArrayIndex {


    public static void main(String[] args) {

        String[] items ={"dog","cat","bat","mat"};

        for (int i = 0; i < items.length; i++) {

            if(items[i].equalsIgnoreCase("cat")){

                System.out.println("The cat's index is --> " +i);
                break;
            }
        }

    }
}
