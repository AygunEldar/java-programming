package InterviewTasks;

public class RepeatSameString {
    public static void main(String[] args) {
        System.out.println(repeatString("hello",5,'*'));
        System.out.println(repeatString("I can do it",7,'!'));
    }
    public static String repeatString(String word,int times,char delimiter){
        String retValue = "";
        for(int i=1;i <= times;i++){
            //take care of last delimiter
            if(i == times){
                retValue += word;//add only word by itself
            }else {
                retValue += word + delimiter+" ";
            }
        }
        return retValue;
    }
}
