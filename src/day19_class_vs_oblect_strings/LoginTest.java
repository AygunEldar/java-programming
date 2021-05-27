package day19_class_vs_oblect_strings;

import java.sql.SQLOutput;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String userName = "Cybertek";
        String password = "abc123";

        if (expUserName.equalsIgnoreCase("cybertek") && expPassword.equals("Abc123")) {
            //if(expPassword.equals("Abc123")){
            System.out.println("user succesfully loged in ");
        } else {


            if (!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Fail - username is incorrect");
            } else {
                System.out.println("Fail - password is incorrect");
            }
        }
           if (userName.isEmpty()){
               System.out.println("Write uese name");
           }else{
               System.out.println("It is right");
           }


    }
}
