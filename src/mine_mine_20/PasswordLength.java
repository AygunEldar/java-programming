package mine_mine_20;

public class PasswordLength {
    public static void main (String[] args){

        String code ="12345";
        String expCode ="12345";
        String usName = "abcdef";
        String exUsName ="abcdef";

        if(usName.length()==6){
            System.out.println("Valid username");
        }else{
            System.out.println("It must be six characters");
        }
        if(code.startsWith("12") &&(expCode.startsWith("12"))){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
        if (usName.contains("cd") && exUsName.contains("cd")){
            System.out.println("Middle is same");
        }else{
            System.out.println("Not same");
        }




    }
}
