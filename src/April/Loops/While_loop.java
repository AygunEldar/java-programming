package April.Loops;

public class While_loop {
    public static void main (String [] args){

        boolean isHungry =true;
        int bananas =0;
        int count =3;

        while(isHungry){
            bananas++;
            System.out.println("Eat banana");
            if(bananas==count){
                isHungry = false;
//isHungry = bananas == count ? false : true;
            }
        }
        System.out.println("Keep eating");
    }

}
