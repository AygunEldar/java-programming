package day54_abstraction;

public class School {
    public static void main(String[] args) {

       // Student student =new Student(); ERROR can t creat object of Student
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();


        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();




    }
}
