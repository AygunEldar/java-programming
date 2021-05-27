package mine_mine_20;

public class SMSMessage_2 {
    public static void main (String [] args ){

        String message ="Sender: [Saim] From number <21356487446>" +
                " Message:{hello, let's code some java}";

                int start = message.indexOf("[");
                int end= message.indexOf("]");
                System.out.println(message.substring((start)+1,end));
                String sender="message.substring((start)+1,end";

                System.out.println(message.substring(message.indexOf("[")+1,
                        message.indexOf("]")));
        System.out.println("***********************************************");

        System.out.println(message.substring(message.indexOf("<")+1,message.indexOf(">")));

        int start1 = message.indexOf("<");
        int end1= message.indexOf(">");
      System.out.println(message.substring(start1+1,end1));

        System.out.println("*********************************************");
      System.out.println(message.substring(message.indexOf("{")+1,message.indexOf("}")));

        int start2=message.indexOf("{");
       int end2 =message.indexOf("}");
      System.out.println(message.substring(start2+1,end2));

        System.out.println("****************************************");

      String my =" book    ";
      System.out.println(my.trim());

    }
}
