package officehours04_14;

public class SecondBiggestNumber {
    public static void main(String[] args) {
//        [IQ] Second Biggest Number
//        Given an Array of numbers. Find and print the 2nd biggest number.
//        Note the 2nd biggest should be unique meaning it should be different from the max number
//        Example:
//        Input:
//[4,3,1,4,5,2,4,8,4,8]
//        Output:
//        5

        int [] nums ={4,3,10,1,4,5,2,4,8,4,8};
        int max = nums[0];
        int secMax =nums[0];
        for(int eachNum : nums){

            if(eachNum > max){
              secMax = max;
                max = eachNum;
            }
            if(eachNum >  secMax && eachNum < max){
                  secMax = eachNum;
            }
        }
        System.out.println("max -- " +max);
        System.out.println(" 2nd biggest number-- "+secMax);
    }
}
