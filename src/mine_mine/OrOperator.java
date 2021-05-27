package mine_mine;

public class OrOperator {
    public static void main (String []args ){

        String student = "Evy";
        if (student =="Evy" || student =="Liz"){
            System.out.println(" The student passed - " + student);
        }else if(student == "Brenda"){
            System.out.println(" The student has just finished -" + student);
        }else{
            System.out.println("The student is still studying -" +student);
        }
        System.out.println("***************************************");

        int pear = 15;
        int lemon = 6;
        System.out.println("Some fruit");
        System.out.println(pear < 12 || lemon >5);
         if( pear > 16 && lemon > 4){
             System.out.println("Lets eat some fruit");
         }else{
             System.out.println("Buy something to eat");
         }
        System.out.println("****************************");

        double cash = 26.40;
        double ticket =16.30;
        String enjoy = "theatre";

        System.out.println("Lets choose where to go ");
        if ((cash < ticket) && ( enjoy.equals("cinema") || enjoy.equals("theatre"))){
            System.out.println(" That's good , have a good time " +enjoy +" price $ " + ticket);
        }else{
            System.out.println(" All are closed "  );
        }

    }
}
