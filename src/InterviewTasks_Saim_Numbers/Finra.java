package InterviewTasks_Saim_Numbers;

public class Finra {
    public static void main(String[] args) {
        divideBy(30);
       // System.out.println(FINRA1());
    }

    public static void divideBy(int num) {

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Finra " +i +" ");
            } else if (i % 5 == 0) {
                System.out.println("Fin " +i +" ");

            } else if (i % 3 == 0) {

                System.out.println("ra " +i+ " ");
            }


        }



    }

//    public static  void FINRA1() {
//
//        String result = "";
//
//        for (int i = 1; i <= 30; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                result += "FINRA ";
//            } else if (i % 5 == 0) {
//                result += "RA ";
//            } else if (i % 3 == 0) {
//                result += "FIN ";
//            } else {
//                result += i + " ";
//            }
//        }
//
//        System.out.println(result);


  //  }
}