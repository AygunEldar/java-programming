package day26_for_loop;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 3;

        for (int i = 1; i <= 10; i++) {

            int result = number * i;
            System.out.println(i + "x" + number + " = " + result);

        }
        System.out.println("*************************************");
        //if number less than 1 or more than 10
        //error
        //exit main method : return;


        number= 8;
        if (number < 1 || number > 10) {
            System.out.println("Error");
            return; // - means exit the main method
        }
            for (int j = 1; j <= 10; j++) {
                // if we put IF here will check 10 times......
                //and we couldn't put on the bottom because negative thing must be first,
                // even it also will be printed both of them
                int result = number * j;
                System.out.println(j + " x " + number + " = " + result);
            }

        }

//        System.out.println("**************************************");
//        int mul =2 ;
//        //                number        i         result =number * i
//        System.out.println(mul +" x " + 1 +" = " +number * 1);
//        System.out.println(mul +" x " + 2 +" = " +number * 2);
//        System.out.println(mul +" x " + 3 +" = " +number * 3);
//        System.out.println(mul +" x " + 4 +" = " +number * 4);
//        System.out.println(mul +" x " + 5 +" = " +number * 5);
//        System.out.println(mul +" x " + 6 +" = " +number * 6);
//        System.out.println(mul +" x " + 7 +" = " +number * 7);
//        System.out.println(mul +" x " + 8 +" = " +number * 8);
//        System.out.println(mul +" x " + 9 +" = " +number * 9);
//        System.out.println(mul +" x " + 10 +" = " +number * 10);


    }
