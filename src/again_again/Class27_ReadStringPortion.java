package again_again;

public class Class27_ReadStringPortion {
    public static void main (String [] args){

        String list = "book,note,pens";
for (int i= 0; i< list.length()-3;i++){
    String part =list.substring(i, i+4);
    System.out.println("part = " + part);

    if(part.equals("book") || part.equals("note")){


    }

}
        System.out.println("School objects were bought");

    }
}
