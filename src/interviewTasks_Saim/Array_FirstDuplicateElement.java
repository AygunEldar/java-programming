package interviewTasks_Saim;

public class Array_FirstDuplicateElement {
    public static void main(String[] args) {
        int[] num = {2,6,7,3,1,7,1};
        System.out.println(findFirstDuplic(num));

    }

    public static int findFirstDuplic(int[] nums) {

        int firstDuplicate = 0;
        for(int each : nums){
            int count = 0;
            for(int each2 : nums){

                if(each == each2)
                    count ++;
            }
            if(count > 1){
               firstDuplicate = each;
               break;
            }
        }
        return firstDuplicate;
    }
}