package day26_for_loop;

public class WeekDays {
    public static void main(String[] args) {

        for(int wDay =1; wDay <=10; wDay++){
            switch(wDay){
                case 1:
                System.out.println(wDay+"-Monday");
                break;
                case 2:
                System.out.println(wDay+"-Tuesday");
                break;
                case 3:
                System.out.println(+wDay+"-Wednesday");
                break;
                case 4:
                System.out.println(wDay+"-Thursday");
                break;
                case 5:
                System.out.println(wDay+"-Friday");
                break;
                case 6:
                System.out.println(wDay+"-Saturday");
                break;
                case 7:
                System.out.println(wDay+"-Sunday");
                break;

                default:
                    System.out.println("no such day, java day");
                break;

            }
        }
    }
}
