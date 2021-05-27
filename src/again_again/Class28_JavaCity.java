package again_again;

public class Class28_JavaCity {
    public static void main (String [] args) {


        int totalCase = 0;
        for(int day =1; day <= 30; day++){

            if(day %7==0){
                totalCase += 500;
            }else{
                totalCase +=200;
                System.out.println("Day "+ day + " | total case " + totalCase);
            }
            System.out.println("Java City "+ totalCase +" for 11/2021");
        }










    }
}
