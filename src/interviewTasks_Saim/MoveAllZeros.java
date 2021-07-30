package interviewTasks_Saim;

public class MoveAllZeros {
    public static void main(String[] args) {
        int [] arr = {1,8,5,0,6,4,0,9,0,0,7};
        int n =arr.length;
        pushZerosToEnd(arr,n);
      for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");

       }
    }
    public static void  pushZerosToEnd(int []arr,int n){

        int count =0;

        for(int i =0; i < n; i++)
           if(arr[i] != 0)
               arr[count++] = arr[i];

           while( count < n)
               arr[count++] = 0;
        }

        // Elvin version
    /*
     public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(2,0,4,0,5,0,4,0,1,0,6,0));
        System.out.println(moveToEnd(numbers));
    }
        public static ArrayList<Integer> moveToEnd (ArrayList<Integer> numbers){
        int num = numbers.size();
        numbers.removeAll(Arrays.asList(0));
        int totalNumberOfZero = num-numbers.size();

        for(int i = 0; i < totalNumberOfZero; i++){
            numbers.add(0);
        }
        return numbers;
        }
     */
}
