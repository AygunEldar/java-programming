package saim_only_03_17;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 5;
        String location = " ";
        int numOfGroups = 0;
        String teacherInCharge = " ";
        String myGrade;
        switch(grade){
            case 1:
                System.out.println("I am at grade " + grade);
                location ="Apple orchard";
                numOfGroups = 1;
                teacherInCharge = "Ms.Smith";
                break;
            case 2:
                System.out.println("I am at grade " + grade);
                location ="Zoo";
                numOfGroups = 7;
                teacherInCharge = "Mr.Lee";
                break;
            case 3:
                System.out.println("I am at grade " + grade);
                location ="Aquarium";
                numOfGroups = 5;
                teacherInCharge = "Ms.Wilsom";
                break;
            case 4:
                System.out.println("I am at grade " + grade);
                location ="Movie theatre";
                numOfGroups = 2;
                teacherInCharge = "Ms.Reyes";
                break;
            case 5:
                System.out.println("I am at grade " + grade);
                location ="Museum";
                numOfGroups = 5;
                teacherInCharge = "Ms.Lela";
                break;
            case 6:
                System.out.println("I am at grade " + grade);
                location ="Six Flags";
                numOfGroups = 8;
                teacherInCharge = "Mr.Watt";
                break;
            default:
                System.out.println("Invalid choice");


        }
        System.out.println("Location: "+ location +"\nNumber of groups: "+ numOfGroups
                + "\nTeacher in charge: " +teacherInCharge);
    }
}
