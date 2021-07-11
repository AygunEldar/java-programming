package july.elgun;

public class AgainIndex {
  public static void main (String [] args){
      System.out.println(showIndex("java",'v'));
  }
    public static int showIndex(String str, char letter){
      int temp = 0;
       for (int i= 0 ; i < str.length(); i++){
           if(str.charAt(i)==letter){
               temp = i;

           }
       }
       return temp;
    }


}
