package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100,200,300);
        addNumbers(12,23,45,56,78,89,23,56,32,32,45);
        addNumbers();
    }
    public static void addNumbers(int ...nums){
        //inside the method it is used as regular array
        int sum =0;
        for(int n : nums){
            sum +=n;
        }
        System.out.println("sum = " +sum);
    }
}
