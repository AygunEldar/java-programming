package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {

        int[] nums = {5, 23, 1, 543, 90};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{23, 45, 569, 78, 98});


        System.out.println("sum = " + ArrayUtils.sum(nums));
        System.out.println("sum = " + ArrayUtils.sum(new int[]{23, 45, 569, 78, 98}));

       int[] nums2 = {4, 8, 5, 62};

        System.out.println("found = " +ArrayUtils.contains(nums2,5));
        System.out.println("10 - found = " +ArrayUtils.contains(nums2,10));
//        int num = 5;
//
//        boolean found = false;
//        for (int each : nums2) {
//            if (each == num) {
//                found = true;
//                break;
//            }
//        }
//        System.out.println();
    }
}