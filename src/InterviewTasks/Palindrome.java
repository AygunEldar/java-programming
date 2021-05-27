package InterviewTasks;

public class Palindrome {
    public static void main(String[] args) {


        System.out.println(isPalin("madam"));

    }

    public static  boolean isPalin(String str){

        for(int i = 0, j = str.length()-1; i < str.length()/2; i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not palindrome");
            }else{
                System.out.println("Palindrome");
            }
        }
return true;
    }

}
