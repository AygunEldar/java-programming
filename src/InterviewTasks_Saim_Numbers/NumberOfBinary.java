package InterviewTasks_Saim_Numbers;

public class NumberOfBinary {
    public static void main(String[] args) {
        System.out.println(getCountOfOnes(10));
    }
    public static int getCountOfOnes(int n) {

        String s = "";
        boolean result = n > 0;

        while (result) {
            s = ((n % 2) == 0 ? "0" : "1") + s;
            n = n / 2;
            result = n > 0;
        }

        int count = 0;
        for (char each : s.toCharArray()) {
            if (each == '1') {
                count++;
            }
        }

        return count;
    }


}
