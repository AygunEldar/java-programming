package interviewTasks_Saim;

public class RegularExpression_Rul {
    public static void main(String[] args) {

        //REGEGS
        String str = "a12.334tyz.78x";
        str = str.replaceAll("[^a-zA-Z]", "*");
       // replace all numbers with star
       // String str = "a12.334tyz.78x";
        str = str.replaceAll("[0-9]", "*");
    }
}
