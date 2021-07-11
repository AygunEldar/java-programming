package july.elgun;

public class LetsTest {
    public static void main(String[] args) {

        Cat rozy = new Cat();
        isAnimal(rozy).speak();
        String str ="";
        try{
            isAnimal(str).speak();//returned null
        }catch(Exception e){

            //handle exception
            System.out.println("null pointer exception happened");
        }
    }
    public static Animal isAnimal(Object obj){
        if(obj instanceof Animal){
            Animal animal =(Animal) obj;
           return animal;


        }
        return null;
    }
}
