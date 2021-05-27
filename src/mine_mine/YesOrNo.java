package mine_mine;

public class YesOrNo {
    public static void main (String [] args){

        System.out.println("Are you sure you want to delete this file?");

        char sel ='y';
        boolean answer;

        if (sel=='y'){
            answer = true;
            System.out.println("Your file will be deleted.");
        }else{
            System.out.println("File deletion cancelled.");
            answer =false;
        }
        System.out.println(" Did file get deleted? -" + answer);
    }
}
