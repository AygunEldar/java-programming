package officehours05_25;

public class Pangram {
    public static void main(String[] args) {

        String s = "A quick brown fox jumps over the lazy dog";
    }
    public static boolean isPangram(String str){
        str.toLowerCase();
        String alp = "abcdefghijklmnopqrstuvwxyz";

        for(int i =0;i <str.length();i++){


           if(Character.isLetter(str.charAt(i))){
               alp =alp.replace(""+ str.charAt(i),"");
              // System.out.println(str.charAt(i)+ " "+ alp);
           }
           if(alp.isEmpty()){
               break;
           }
        }
        return alp.isEmpty();
    }
}
