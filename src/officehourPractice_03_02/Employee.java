package officehourPractice_03_02;

public class Employee {
    public static void main (String [] args ) {
        String fName, lName, fullName;
        fName = "Evy";
        lName = "Henson";
        fullName = fName +  " " + lName;
        String compName = "IBM";
        double sal = 156000.0;
        String stDay = "03";
        String month = "March";
        String year = "2021";
        String fullStDate =  month +" "+ stDay+ "," + year;
        boolean ftJob = true;
        String position = "engineer";
        String add = "590 Madison Ave, NY";
        String email =fName+stDay+"@"+ compName + ".com";
        double after = sal +(2*1000);

        System.out.println("*****IBM New Hire Information*****");
        System.out.println();
        System.out.println(fName + " welcome to " + compName+ ".");
        System.out.println("Your start date as an " + position +" will be on "+ fullStDate);
        System.out.println("You are fulltime " + ftJob+ " and will be making " +sal+ "per year .");
        System.out.println("The office is located at: \n" + add );
        System.out.println();
        System.out.println(        "Official Information"       );
        System.out.println("New hire name : "+ fullName);
        System.out.println("Starts on : " + fullStDate);
        System.out.println("Email generated : " + email);
        System.out.println("Your expected salary after 3 years : "+ after);
        System.out.println("*******GOODLUCK*******");



    }
}
