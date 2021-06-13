package day53_inheritance.final_keyword;

/**
 * TestData class that has a list of Constants
 * Values can not be changed
 */
public final class TestData {
    public static final  String ADMIN_USERNAME = "admin";
    public static final  String ADMIN_PASSWORD = "password123";
    public static final  int  MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;

}/**
 ERROR: can not be Inherited
*/
 //class Child extends TestData {

// }