package day60_exceptions;

public class ThrowingException {
    public static void main(String[] args) {

        System.out.println("Let's create exceptions");
//        RuntimeException e  = new RuntimeException();
//        throw e;  //manually we created exception

       // throw new RuntimeException();
        String userName = "";
        if(userName.isEmpty()){
            throw new RuntimeException("username cannot be empty");
            //Assert.fail("reason message ..")
        }
    }
}
