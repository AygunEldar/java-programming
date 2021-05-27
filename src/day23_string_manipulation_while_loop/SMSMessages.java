package day23_string_manipulation_while_loop;

public class SMSMessages {
    public static void main(String[] args) {

        String message ="Sender: [Nadir] From Number <(202)375-1774> Message:{Hello, lets code some java}";
        int idxNum1 = message.indexOf("[");
        int idxNum2 = message.indexOf("]");
        System.out.println(message.substring(idxNum1+1,idxNum2));

        String sender = message.substring(idxNum1+1,idxNum2);
        System.out.println("sender = " + sender);
         System.out.println(message.substring((message.indexOf("[")+1),message.indexOf("]")));

        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobile = " + mobile);

        String bracket = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("bracket = " + bracket);

        System.out.println("  Fikret ".trim());
        sender=sender.trim();

        if(sender.equals("Saim")){
            System.out.println("Message from Saim about homework");
        }else{
            System.out.println("Someone else message");


           // System.out.println(message.charAt(message.indexOf(",")));

        }
        

    }
}
