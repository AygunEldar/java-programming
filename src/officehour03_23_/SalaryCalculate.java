package officehour03_23_;

public class SalaryCalculate {
    public static void main(String[] args) {

//        Given the following information: hourly rate, weekly hours, and number of weeks. Check if all the inputs are valid and then calculate the salary.
//        - hourly rate cannot be negative or zero
//-> If invalid print: Hourly Rate cannot be Negative or Zero
//                - weekly hours cannot be zero, negative or more than 65
//-> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
//                - number of weeks cannot be less than 1 and more than 52
//-> If invalid print: Number of weeks cannot be less than 1 or greater than 52
//        Equation: salary = hourly rate * weekly hours * number of weeks

        int hourlyRate = 10;
        int weeklyHours =40;
        int numOfWeeks = 52;
        boolean hourlyRateIsValid = hourlyRate > 0;
        boolean weeklyHoursAreValid = weeklyHours > 0 && weeklyHours <= 65;
        boolean numOfWeeksAreValid = numOfWeeks > 0 && numOfWeeks <= 52;

        if(hourlyRateIsValid ){
            if(weeklyHoursAreValid){
                if(numOfWeeksAreValid){
                    System.out.println("Salary is " +(hourlyRate * weeklyHours * numOfWeeks));

                }else{
                    System.out.println("Number of weeks can not be less than 1 and more than 52");
                }

            }else{
                System.out.println("Weekly hours can not be negative, zero and more than 65");
            }

        }else{
            System.out.println("Hourly rate can not be negative and zero");
        }
        System.out.println("*******************************************");

       if(hourlyRateIsValid && weeklyHoursAreValid &&numOfWeeksAreValid){
       System.out.println("Salary is : " + (hourlyRate * weeklyHours * numOfWeeks));
     }else {
           if(!hourlyRateIsValid){
               System.out.println("Hourly rate can not be negative and zero");
           }else if(!weeklyHoursAreValid){
               System.out.println("Weekly hours can not be negative, zero and more than 65");
           }else{
               System.out.println("Number of weeks can not be less than 1 and more than 52");
           }
      }





    }
    }
