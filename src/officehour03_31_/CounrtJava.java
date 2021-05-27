package officehour03_31_;

public class CounrtJava {
    public static void main(String[] args) {

        String str ="java is fun, java class today, java";
        int count =0;
        while(str.contains("java")){
            count++;
            str=str.replaceFirst("java","");

          //  System.out.println(str);
        }
        System.out.println("Java was found " + count +" times");
    }
}
