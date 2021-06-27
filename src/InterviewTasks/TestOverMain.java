package InterviewTasks;

public class TestOverMain {
    public static void main(String[] args) {

         main("books");
         main();
    }
    public  static void main(String args){

        System.out.println("main with String args");
    }

    public  static void main(){
        System.out.println("main without args");

    }
}
