package April;
import java.util. *;

public class ArrayQuiz {
    public static void main(String[] args) {

        int n = 0;
String [] days ={"sun","mon","wed","sat",};
for(int i =0; i< days.length; i++){
    switch(days[i]){
        case"sat":
        case "sun":
            n -=1;
            break;
        case"mon":
            n++;
        case"wed":
            n+=2;

    }
}
        System.out.println(n);
    }
}
