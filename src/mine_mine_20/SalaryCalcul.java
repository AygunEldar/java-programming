package mine_mine_20;

public class SalaryCalcul {
    public static void main (String [] args){

        int hourlyRate=15;
        int weeklyHours=45;
        int numberOfWeeks=52;
        boolean hourlyRateIsValid= hourlyRate > 0;
        boolean weeklyHoursAreValid= weeklyHours > 0 && weeklyHours <=65;
        boolean numberOfWeeksAreValid = numberOfWeeks > 0 && numberOfWeeks <=52;

        if(hourlyRateIsValid){
            if(weeklyHoursAreValid){
                if(numberOfWeeksAreValid){
                    System.out.println("Salary is $ " +hourlyRate * weeklyHours * numberOfWeeks);
                }else{
                    System.out.println("Number of weeks can't be less than 1 , and more than 52");
                }
            }else{
                System.out.println("Weekly hours can't be zero, negative or more than 65");
            }

        }else {
            System.out.println("Hourly rate can't be negative or zero");

        }
            System.out.println("**********************************************");

            if(hourlyRateIsValid && weeklyHoursAreValid && numberOfWeeksAreValid){
                System.out.println("Salary is $ " +( hourlyRate * weeklyHours * numberOfWeeks));
            }else{
                if(!hourlyRateIsValid){
                    System.out.println("Hourly rate can't be negative and zero");
                }else if(!weeklyHoursAreValid){
                    System.out.println("Weekly hours can't be negative, zero or more than 65");
                }else{
                    System.out.println("Number of weeks can't be lees than 1 and more than 52");
                }
            }



        }

    }

