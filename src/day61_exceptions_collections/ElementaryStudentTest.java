package day61_exceptions_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) {


        try {
            ElementaryStudent el1 = null;
            el1 = new ElementaryStudent();
            el1.setName("Bob");
            el1.setAge(4);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace();//PRINT ERROR STACK TRACE AND CONTINUE, DOES NOT STOP CODE
        }


        System.out.println("----EXECUTION COMPLETED-----");
    }

}
