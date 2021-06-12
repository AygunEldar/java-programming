package InterviewTasks;

public class UniqueLetter {

    public static void main(String args[]) {

        String school = "javva";
        String unique = "";

        //char [] letters =school.toCharArray();
        for (int i = 0; i < school.length(); i++) {
            int count = 0;

            for (int j = 0; j < school.length(); j++) {
                if (school.charAt(i) == school.charAt(j)) {

                    count++;
                }


                }
                if (count == 1) {
                    unique = school.charAt(i) + "";
            }


        }
        System.out.println(unique);
    }

}





