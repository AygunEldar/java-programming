package InterviewTasks;

import java.util.ArrayList;
import java.util.List;

public class NaditString {
    public static void main(String[] args) {

         measure("book");
    }

    public static void measure(String str){

        if(str.length () >= 3 ) {
            System.out.println(str);

        }else{
            System.out.println("less than 3 letters");
        }
    }


//

    public static List<String> newbiewBarberer(List<String> toBeTrimmed){
        if(toBeTrimmed.size() == 0) return null;
        List<String> result = new ArrayList<>(toBeTrimmed.size());
        for(int i = 0; i< toBeTrimmed.size(); i++){
            result.add(toBeTrimmed.get(i).trim());
        }
        return result;
    }
    //
    public static List<String> trimmedList(List<String> list) {

        if(list == null) return null;
        else {
            for(int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).trim());
            }
            return list;
        }
    }
}
