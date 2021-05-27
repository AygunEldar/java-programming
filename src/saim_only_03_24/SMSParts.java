package saim_only_03_24;

public class SMSParts {
    public static void main (String [] args){
        
        String message ="Sender:<James Bond>.From Number:[202-123-3456]." +
                "+Message:{I love programming and problem solving}"; 
                
        String sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("sender = " + sender);
        
        String number = message.substring(message.indexOf("[")+1,message.indexOf("]"));
        System.out.println("number = " + number);
        
        String text =message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("text = " + text);
        
        
        
        
        
        
    }
}
