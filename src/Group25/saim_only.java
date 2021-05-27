package Group25;

public class saim_only {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddee";
        int n = str.length();
        int max = 0;
        char result = str.charAt(0);
        int count = 1;

        for (int i = 0; i < n; i++) {

            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
                count++;

            else {
                if (count > max) {
                    max = count;
                    result = str.charAt(i);
                }
                count = 1;
            }
        }
        System.out.println(str.substring(str.indexOf(result),str.lastIndexOf(result)+1));

           }
       }











