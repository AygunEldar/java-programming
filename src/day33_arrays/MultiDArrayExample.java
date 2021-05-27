package day33_arrays;
import   java.util. *;

public class MultiDArrayExample {
    public static void main(String[] args) {

        String[][]users = new String[3][2];
// long way
        users[0][0] ="Teodora";
        users[0][1] = "Teodora12";
        users[1][0] ="Anna";
        users[1][1] = "Anna56";
        users[2][0] ="Parvin";
        users[2][1] = "Parvin312";


        //short way

        String [][] userData ={{"Teodora", "Teodora12"},
                                  {"Anna","Anna56"},
                                  { "Parvin","Parvin312"}};


        System.out.println(userData[0][0].split(" ")[0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);

        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);

        System.out.println(Arrays.deepToString(userData));






    }
}
