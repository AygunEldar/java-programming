package july.elgun;

public class FindWithIndex {
    public static void main(String[] args) {
        System.out.println(findWithIndex("java",'v'));

    }
    public static int findWithIndex(String str, char letter){
         int temp= 0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == letter){
                 temp=i;
                 break;


            }

        }
        return temp;
    }
}
