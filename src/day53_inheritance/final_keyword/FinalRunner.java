package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
       // TestData.ADMIN_USERNAME = "change";ERROR: can not change value of final variable

        final int SSN = 412546568;
       // SSN =1324657987;// it is finla it can't be changed
    }
}
