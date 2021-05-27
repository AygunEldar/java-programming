package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main (String [] args){
   System.out.println("Choose your language ");
         int selection = 6;
        if(selection == 1){
            System.out.println("Hello, thank you for your call");
        }else if(selection == 2){
            System.out.println(" Merhaba ,aradiginiz icin tesekkurler");
        }else if(selection ==3){
            System.out.println("Hola, gracias para llamar" );
        }else if(selection == 4){
            System.out.println("privet, spasibo za vash zvonok");
        }else if(selection == 5){
            System.out.println("Merci ,pour votre appel");

        }else if (selection == 6){
            System.out.println("lets talk java and english, hello");
        }else{
            System.out.println("Only code java without speaking");
        }
        System.out.println("THANK YOU FOR YOUR CALLING");
    }


}
