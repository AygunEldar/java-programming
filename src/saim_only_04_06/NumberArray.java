package saim_only_04_06;

public class NumberArray {
    public static void main(String[] args) {

        int[] nums = new int[100];
        for (int i = 0; i <= 100; i++) {

        }
           int count = 0;
            for (int each : nums) {
                count ++;
                each = count;
                System.out.print(each + " ");
            }

        }

    }


