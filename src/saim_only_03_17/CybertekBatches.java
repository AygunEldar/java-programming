package saim_only_03_17;

import java.sql.SQLOutput;

public class CybertekBatches {
    public static void main(String[] args) {
        System.out.println("In Cybertek we have 3 batch types");
        String batch = "US";
        String batchUS = "US evening";

        if (batch.equals("US")){
            if(batchUS.equals("US morning")){
                System.out.println("Class times are 10-5 EST. Monday, Tuesday, Thursday, Friday");
            }else {
                System.out.println("Class times ate 7-10 EST. Monday, Tuesday, Wednesday, Thursday, Saturday, Sunday");
            }

        }else if(batch.equals("EU")){
            System.out.println("Class times are 10- 5 EST.Monday, Tuesday, Wednesday, Thursday, Friday ");
        }else{
            System.out.println("Invalid time for our batches");

        }
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        String batchType = "US"; // EU

        if(batchType.equals("US") || batchType.equals("us")){

            boolean isMorning = false;

            if(isMorning) {
                System.out.println("Class times are 10-5 EST. M, T, Th, F");
            } else {
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            }

        } else if (batchType.equals("EU") || batchType.equals("eu")) {

            System.out.println("Class times are  10-5 EST. M, T, W, Th, F");

        } else {
            System.out.println("Invalid Batch type");
        }



    }

}
