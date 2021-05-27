package day37_methods_overloading;

public class WarmupMethods {
    public static void main(String[] args) {
        loginVoid("Cybertekstudent", "abc123");//positiv test, sunny day
       loginVoid("cybertek", "answer");//negative test/rainy test scenario
        System.out.println(login("cybertekStudent","abc123"));

        if(login("cybertekStudent","abc123")){
            System.out.println("Login succesful, welcome to Canvas");
            System.out.println("Select the course to continue ");
        }else{
            System.out.println("login failed");
        }
   boolean isLoginSuccess = login("nadir","mountain");
        System.out.println("Is login success = " +isLoginSuccess);

        if(login("nadir","mountain")){
            System.out.println("Welcome to Canvas,select course or calendar");
        }else{
            System.out.println("Something wrong with your credentials");
        }
        //String ret = System.out.println("hello"); ERROR it is void

    }

    public static void loginVoid(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login Successful, welcome cybertekStudent");
        } else {
            System.out.println("Incorrect username or password");
        }

    }

    public static boolean login(String userName, String password){
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        //return userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword
        if(userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)){
            return true;
        }
            return false;
    }



}

